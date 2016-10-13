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
public class Car extends Vehicle {

    private int speed;
    private person driver;
    
    public Car(String name, int seats, int s) {
        super(name, seats);
        speed = s;
        this.driver = new Driver("Simeon");
    }

    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    

    @Override
    public String run() {
        return  this.driver.getName() + " is driving the " + this.getVehicleName() ;
    }

    @Override
    public String stop() {
        return this.getVehicleName() + " is braking and stopping";
    }

    @Override
    public String accelerate() {
        return this.getVehicleName() + " is accelerating";
    }
    
}
