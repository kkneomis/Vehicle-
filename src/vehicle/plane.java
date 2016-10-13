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

    private Pilot pilot;
    
    public plane(String name, int seats) {
        super(name, seats);
        this.pilot = new Pilot("Joe");
    }
    
    /**
     *A car can be driven
     * @return action
     */
    @Override
   public String run(){
       return this.pilot.getName() + " is flying " + this.getVehicleName();
   }
   
    /**
     *A car gan go up to 90mph
     * @return 
     */
    @Override
   public String accelerate(){
       return ("I can go up to 90mph");
   }
   
    /**
     *Stopping this car
     * @return 
     */
    @Override
   public String stop(){
       return ("Landing this plane");
   }
    
}
