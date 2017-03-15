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
public class Circle implements iGeometricObject{ //Implements iGeometricObject
    protected double radius;
    //Constructor
    public Circle (double radius)
    {
        this.radius=radius; 
    }
    //iGeometricObject's methods
    @Override
    public double getPerimeter() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getArea() {
        return 2*this.radius*Math.PI;
    }
}
