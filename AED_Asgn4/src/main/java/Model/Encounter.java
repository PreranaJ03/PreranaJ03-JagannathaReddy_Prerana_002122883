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
    private Date dateofvisit;
    VitalSigns vitals;

    public Date getDateofvisit() {
        return dateofvisit;
    }

    public void setDateofvisit(Date dateofvisit) {
        this.dateofvisit = dateofvisit;
    }

    public VitalSigns getVitals() {
        return vitals;
    }

    public void setVitals(VitalSigns vitals) {
        this.vitals = vitals;
    }
    

        
}
