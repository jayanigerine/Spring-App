package com.example.springrevisionjpa.service.impl;

import com.example.springrevisionjpa.model.CloudVendor;
import com.example.springrevisionjpa.repository.CloudVendorRepository;
import com.example.springrevisionjpa.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

   public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public CloudVendor getCloudVendor(Integer vendorId) {
        return (CloudVendor) cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudvendor() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public String addCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "successfully added";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "successfully updated";
    }

    @Override
    public String deleteCloudVendor(Integer vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "successfully deleted";
    }
}
