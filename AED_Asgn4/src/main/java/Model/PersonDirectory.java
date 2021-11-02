/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import Model.Person;
import java.util.ArrayList;

/**
 *
 * @author prerana
 */
public class PersonDirectory {
    List<Person> listofpersons = new ArrayList<Person>();

    public List<Person> getListofpersons() {
        return listofpersons;
    }

    public void setListofpersons(List<Person> listofpersons) {
        this.listofpersons = listofpersons;
    }
    
    
}
