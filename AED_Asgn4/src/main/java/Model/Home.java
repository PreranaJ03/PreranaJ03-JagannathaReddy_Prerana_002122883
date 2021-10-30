/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author prerana
 */
public class Home {
    
    private String Apt_number;
    private String Apt_Name;
    private String Street;
    //private String city;
    //private String State;
    private String Postal_Code;
    Community community;
    
    public Home() {
        
    }

    public String getApt_Name() {
        return Apt_Name;
    }

    public void setApt_Name(String Apt_Name) {
        this.Apt_Name = Apt_Name;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    
    public String getApt_number() {
        return Apt_number;
    }

    public void setApt_number(String Apt_number) {
        this.Apt_number = Apt_number;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return State;
//    }
//
//    public void setState(String State) {
//        this.State = State;
//    }

    public String getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(String Postal_Code) {
        this.Postal_Code = Postal_Code;
    }
    
    
    
}
