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
    
    //private String Apt_number;
    private String Apt_Name;
    Community community;
    
    public Home(String Apt_Name, Community community) {
        //this.Apt_number = Apt_number;
        this.Apt_Name = Apt_Name;
        this.community = community;        
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
    
    
//    public String getApt_number() {
//        return Apt_number;
//    }
//
//    public void setApt_number(String Apt_number) {
//        this.Apt_number = Apt_number;
//    }

        
}
