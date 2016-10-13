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
public abstract class person {
    
    private String name;
    
    public person(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    abstract String drive();
    abstract String clean();
    
}
