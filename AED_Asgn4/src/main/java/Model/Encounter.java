/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author prerana
 */
public class Encounter {
    private String dateofvisit;
    VitalSigns vitals;

    public Encounter(String dateofvisit, VitalSigns vitals) {
        this.dateofvisit = dateofvisit;
        this.vitals = vitals;
    }
    
    

    public String getDateofvisit() {
        return dateofvisit;
    }

    public void setDateofvisit(String dateofvisit) {
        this.dateofvisit = dateofvisit;
    }

    public VitalSigns getVitals() {
        return vitals;
    }

    public void setVitals(VitalSigns vitals) {
        this.vitals = vitals;
    }
    

        
}
