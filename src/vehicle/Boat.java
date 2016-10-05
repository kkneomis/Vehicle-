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

    public Boat(String name, int seats) {
        super(name, seats);
    }

    @Override
    public void run() {
        System.out.println("Boat is now running on water");
    }

    @Override
    public void stop() {
        System.out.println("Stopping this boat");
    }

    @Override
    public void accelerate() {
        System.out.println("I can go up to 50mph on water");
    }
    
}
