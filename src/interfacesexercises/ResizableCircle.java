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
public class ResizableCircle extends Circle implements iResizable { //Inherits from the class circle, and implements methods
    //from iResizable
    //Constructor
    public ResizableCircle(double radius)
    {
        super (radius);
    }
    //iRezisable's methods
    @Override
    public void resize(int percent) 
    {
        this.radius*=(100+ percent)/100;
    }
    
}
