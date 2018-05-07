package com.gyo.vendor.controllers;

import com.gyo.vendor.entities.Vendor;
import com.gyo.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VendorController {
    @Autowired
    VendorService service;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createVendor";
    }
    @RequestMapping("/saveVen")
    public String saveVendor(@ModelAttribute("vendor")Vendor vendor, ModelMap modelMap){
        Vendor vendorSaved =service.saveVendor(vendor);
        String msg = "Vendor saved with Id: "+vendorSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createVendor";
    }
    @RequestMapping("/displayVendors")
    public String displayVendors(ModelMap modelMap){
        List<Vendor> vendors = service.getAllVendors();
        modelMap.addAttribute("vendors", vendors);
        return "displayVendors";
    }
    @RequestMapping("/deleteVendor")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap){
        Vendor vendor= new Vendor();
        vendor.setId(id);
        service.deleteVendor(vendor);
        List<Vendor> vendors = service.getAllVendors();
        modelMap.addAttribute("vendors", vendors);

        return "displayVendors";
    }
    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap){
        Vendor vendor = service.getVendorById(id);
        modelMap.addAttribute("vendor", vendor);
        return "updateVendor";
    }
    @RequestMapping("/updateVen")
        public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap){
        service.updateVendor(vendor);
        List<Vendor> vendors = service.getAllVendors();
        modelMap.addAttribute("vendors", vendors);
        return "displayVendors";
        }
}