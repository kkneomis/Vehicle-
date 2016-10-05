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

    public Car(String name, int seats) {
        super(name, seats);
    }

    @Override
    public void run() {
        System.out.println("Car is driving");
    }

    @Override
    public void stop() {
        System.out.println("Braking this car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating this car");
    }
    
}
