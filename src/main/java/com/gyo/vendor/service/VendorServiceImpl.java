package com.gyo.vendor.service;

import com.gyo.vendor.entities.Vendor;
import com.gyo.vendor.repo.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository repository;
    public VendorRepository getRepository(){return repository;}
    public void setVendor(VendorRepository repository){this.repository = repository;}
    @Override
    public Vendor saveVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
            return repository.save(vendor);
    }

    @Override
    public void deleteVendor(Vendor vendor) {
            repository.delete(vendor);
    }

    @Override
    public Vendor getVendorById(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return repository.findAll();
    }
}
