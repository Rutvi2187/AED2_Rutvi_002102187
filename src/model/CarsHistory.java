/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rutvi patel
 */
public class CarsHistory {
    private ArrayList<CarDetails> history;

    public CarsHistory() {
        
        this.history= new ArrayList<CarDetails>();
    }

    public ArrayList<CarDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarDetails> history) {
        this.history = history;
    }
    
    public CarDetails AddNewDetails()
    {
        CarDetails newDetails = new CarDetails();
        history.add(newDetails);
        return newDetails;
    }
    
    public void deleteCar(CarDetails cd)
    {
        history.remove(cd);
    }
}
