package com.example.springrevisionjpa.controller;

import com.example.springrevisionjpa.model.CloudVendor;
import com.example.springrevisionjpa.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{id}")
    public CloudVendor getCloudVendorDetails(@PathVariable("id") Integer vendorId) {
    return cloudVendorService.getCloudVendor(vendorId);
}
@GetMapping
    public List<CloudVendor> getAllCloudvendorDetails() {
        return cloudVendorService.getAllCloudvendor();
    }

@PostMapping
public String addCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    cloudVendorService.addCloudVendor(cloudVendor);
    return "successfully added";
}
@PutMapping("/updated")
public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
    cloudVendorService.updateCloudVendor(cloudVendor);
    return "successfully updated";
}
@DeleteMapping("/{id}")
public String deleteCloudVendor(@PathVariable("id") Integer vendorId) {
    cloudVendorService.deleteCloudVendor(vendorId);
    return "successfully deleted";

}

}
