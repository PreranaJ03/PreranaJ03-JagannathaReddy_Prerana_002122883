/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author prerana
 */
public class Community {
    List<Home> homes;
    City city;
    String communityName;

    public List<Home> getHomes() {
        return homes;
    }

    public void setHomes(List<Home> homes) {
        this.homes = homes;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    
    
    
}
