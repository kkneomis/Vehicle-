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
public class Boat extends Vehicle {

    private Captain captain;
    
    public Boat(String name, int seats) {
        super(name, seats);
        this.captain = new Captain("Lt. Dan");
    }

    @Override
    public String run() {
        return this.captain.getName() + " is steering " + this.getVehicleName();
    }

    @Override
    public String stop() {
        return ("Stopping this boat");
    }

    @Override
    public String accelerate() {
        return ("I can go up to 50mph on water");
    }
    
}
