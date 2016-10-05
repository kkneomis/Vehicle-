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
public class plane extends Vehicle {

    public plane(String name, int seats) {
        super(name, seats);
    }
    
    /**
     *A car can be driven
     */
    @Override
   public void run(){
       System.out.println("I am flying");
   }
   
    /**
     *A car gan go up to 90mph
     */
    @Override
   public void accelerate(){
       System.out.println("I can go up to 90mph");
   }
   
    /**
     *Stopping this car
     */
    @Override
   public void stop(){
       System.out.println("Landing this plane");
   }
    
}
