/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author simeonkakpovi
 */
public abstract class Vehicle {

    private String vehicleName;
    private int seatCount;
            
    public Vehicle(String name, int seats){
        vehicleName = name;
        seatCount = seats;
    }
    
    public String getVehicleName(){
        return vehicleName;
    }
    
    public void setVehicleName(String name){
        vehicleName = name;
    }
    
    public int getSeatCount(){
        return seatCount;
    }
    
    public void setSeatCount(int seats){
        seatCount = seats;
    }
    
    abstract String run();
    abstract String stop();
    abstract String accelerate();
    
}
