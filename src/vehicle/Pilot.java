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
public class Pilot extends person{
    
    public Pilot(String name){
        super(name);     
    }
    
     @Override
    public String drive() {
        return this.getName() + " is flying a plane";
    }

    @Override
    public String clean() {
        return this.getName() + " is cleaning this a plane";
    }
    
}
