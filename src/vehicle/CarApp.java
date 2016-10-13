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
public class CarApp {
    
    public static void main(String[] args){
        
        Car car1 = new Car("blue Nissan", 5, 40);
        Boat veh2 = new Boat("Blue Mermaid", 8);
        plane veh3 = new plane("Blackhawk", 80);
        
        System.out.println(car1.run());
        System.out.println(veh2.run());
        System.out.println(veh3.run());
        System.out.println(car1.accelerate());
        System.out.println(veh2.accelerate());
        System.out.println(car1.stop());
        System.out.println(veh2.stop());
        
        
    }
    
}
