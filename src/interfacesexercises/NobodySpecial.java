/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

/**
 *
 * @author Salvador
 */
public class NobodySpecial extends Human{ //Extends from the Human class, not implementing any interfaces
    //Constructor 
    public NobodySpecial(String name) {
        super(name);
    }
    
    @Override
    public String toString() {
        return "NobodySpecial{" + super.toString()+ '}';
    }
    
}
