/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import Model.*;
import java.util.ArrayList;

/**
 *
 * @author prerana
 */
public class PatientDirectory {
    
    List<Patient> listofpatients = new ArrayList<Patient>();

    public List<Patient> getListofpatients() {
        return listofpatients;
    }

    public void setListofpatients(List<Patient> listofpatients) {
        this.listofpatients = listofpatients;
    }
    
    
    
}
