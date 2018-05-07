package com.gyo.vendor.service;

import com.gyo.vendor.entities.Vendor;

import java.util.List;

public interface VendorService {

    Vendor saveVendor(Vendor vendor);
    Vendor updateVendor(Vendor vendor);
    void deleteVendor(Vendor vendor);
    Vendor getVendorById(int id);
    List<Vendor> getAllVendors();
}
