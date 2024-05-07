package com.example.springrevisionjpa.service;

import com.example.springrevisionjpa.model.CloudVendor;
import com.example.springrevisionjpa.repository.CloudVendorRepository;


import java.util.List;
public interface CloudVendorService {
    public CloudVendor getCloudVendor(Integer vendorId);
    public List<CloudVendor> getAllCloudvendor();
    public String addCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(Integer vendorId);



}
