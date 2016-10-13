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
public class Captain extends person{
    
    public Captain(String name){
        super(name);
    }
    
     @Override
    public String drive() {
        return this.getName() + " is driving steering a boat";
    }

    @Override
    public String clean() {
        return this.getName() + " is cleaning a boat";
    }
    
}
