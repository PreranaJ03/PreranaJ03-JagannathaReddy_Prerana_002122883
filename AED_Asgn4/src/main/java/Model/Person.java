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
    private int age;
    private String email_ID;
    Home home;

    public Person(String Unique_ID, String name, int age, String email_ID, Home home) {
        this.Unique_ID = Unique_ID;
        this.name = name;
        this.age = age;
        this.email_ID = email_ID;
        this.home = home;
    }
    
    

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

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }
      

        
}
