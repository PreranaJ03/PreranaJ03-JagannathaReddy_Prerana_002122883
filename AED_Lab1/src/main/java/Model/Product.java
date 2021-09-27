/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;

/**
 *
 * @author prerana
 */
public class Product {
    
    private String name;
    private String dob;
    private String geodata;    
    private int ph_num;
    private int fax_num;
    private String email;
    private String ssn;
    private String med_num;
    private String healtthPlan_num;
    private int bank_details;
    private String license;
    private String vehicle_ID;
    private String device_ID;
    private String linkedIN;
    private String ip_address;
    private File photo;
    private String uID;

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String getGeodata() {
        return geodata;
    }

    public void setGeodata(String geodata) {
        this.geodata = geodata;
    }

    public int getPh_num() {
        return ph_num;
    }

    public void setPh_num(int ph_num) {
        this.ph_num = ph_num;
    }

    public int getFax_num() {
        return fax_num;
    }

    public void setFax_num(int fax_num) {
        this.fax_num = fax_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMed_num() {
        return med_num;
    }

    public void setMed_num(String med_num) {
        this.med_num = med_num;
    }

    public String getHealtthPlan_num() {
        return healtthPlan_num;
    }

    public void setHealtthPlan_num(String healtthPlan_num) {
        this.healtthPlan_num = healtthPlan_num;
    }

    public int getBank_details() {
        return bank_details;
    }

    public void setBank_details(int bank_details) {
        this.bank_details = bank_details;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getVehicle_ID() {
        return vehicle_ID;
    }

    public void setVehicle_ID(String vehicle_ID) {
        this.vehicle_ID = vehicle_ID;
    }

    public String getDevice_ID() {
        return device_ID;
    }

    public void setDevice_ID(String device_ID) {
        this.device_ID = device_ID;
    }

    public String getLinkedIN() {
        return linkedIN;
    }

    public void setLinkedIN(String linkedIN) {
        this.linkedIN = linkedIN;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    
    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }
    
    
        
}


