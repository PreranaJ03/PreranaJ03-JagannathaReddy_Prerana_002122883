/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author prerana
 */
public class CarFleetHistory {
    private ArrayList<CarFleet> history;
    
    public CarFleetHistory() {
        this.history = new ArrayList<CarFleet>();
    }

    public ArrayList<CarFleet> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarFleet> history) {
        this.history = history;
    }
    
    public CarFleet addNewCar() {
        
        CarFleet newCar = new CarFleet();
        history.add(newCar);
        return newCar;
        
    }
    
    public void deleteCars(CarFleet cf){
        history.remove(cf);
    }
    
}
