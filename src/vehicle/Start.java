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
public class Start {
    
    public static void main(String[] args){
        plane myPlane = new plane("F16", 10);
        Car myCar = new Car("Chevy", 5, 30);
        Boat myBoat = new Boat("Boaty McBoatyface", 50);
        
        System.out.println(myPlane.run());
        myPlane.stop();
        myPlane.accelerate();
        
    }
    
}
