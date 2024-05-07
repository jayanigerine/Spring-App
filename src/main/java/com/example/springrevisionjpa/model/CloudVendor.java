package com.example.springrevisionjpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vendor_id")
    private Integer vendorId;
    @Column(name = "vendor_name")
    private String vendorName;
    @Column(name = "vendor_phno")
    private String vendorPhno;
    @Column(name = "vendor_address")
    private String vendorAddress;

    public CloudVendor(Integer vendorId, String vendorName, String vendorPhno, String vendorAddress) {
        this.vendorName = vendorName;
        this.vendorPhno = vendorPhno;
        this.vendorAddress = vendorAddress;
    }

    public CloudVendor() {
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhno() {
        return vendorPhno;
    }

    public void setVendorPhno(String vendorPhno) {
        this.vendorPhno = vendorPhno;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
}
