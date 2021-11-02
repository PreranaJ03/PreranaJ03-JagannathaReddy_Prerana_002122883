/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prerana
 */
public class System {
    PersonDirectory persondir;
    PatientDirectory patientdir;
    List<City> city = new ArrayList<>();

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }
    
    

    public PersonDirectory getPersondir() {
        return persondir;
    }

    public void setPersondir(PersonDirectory persondir) {
        this.persondir = persondir;
    }

    public PatientDirectory getPatientdir() {
        return patientdir;
    }

    public void setPatientdir(PatientDirectory patientdir) {
        this.patientdir = patientdir;
    }
    
    
    
}
