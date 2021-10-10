/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author prerana
 */
public class CarFleet {
    private String lisence_no;
    private String serial_no;
    private String car_type;
    private int model_no;
    private String brand;
    private String availability;
    private String location;
    private int seats;
    private String year_manufactured;
    private String maintenance_due;  

    public CarFleet(String[] data) {
      lisence_no = data[0];
      serial_no = data[1];
      car_type = data[2];
      model_no = Integer.parseInt(data[3]);
      brand = data[4];
      availability = data[5];
      location = data[6];
      seats = Integer.parseInt(data[7]);
      year_manufactured = data[8];
      maintenance_due = data[9];
      
      
    }

    CarFleet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLisence_no() {
        return lisence_no;
    }

    public void setLisence_no(String lisence_no) {
        this.lisence_no = lisence_no;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public int getModel_no() {
        return model_no;
    }

    public void setModel_no(int model_no) {
        this.model_no = model_no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getYear_manufactured() {
        return year_manufactured;
    }

    public void setYear_manufactured(String year_manufactured) {
        this.year_manufactured = year_manufactured;
    }

    public String getMaintenance_due() {
        return maintenance_due;
    }

    public void setMaintenance_due(String maintenance_due) {
        this.maintenance_due = maintenance_due;
    }
    
    @Override
    public String toString(){
        return lisence_no;
    }   
    
    
}
