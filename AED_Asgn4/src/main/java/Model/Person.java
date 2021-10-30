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
public class Person {
    
    private String Unique_ID;
    private String name;
    private Date DOB;
    private int age;
    private String email_ID;

    public String getUnique_ID() {
        return Unique_ID;
    }

    public void setUnique_ID(String Unique_ID) {
        this.Unique_ID = Unique_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail_ID() {
        return email_ID;
    }

    public void setEmail_ID(String email_ID) {
        this.email_ID = email_ID;
    } 
   
    

        
}
