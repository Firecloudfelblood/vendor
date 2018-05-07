package com.gyo.vendor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gyo.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}
