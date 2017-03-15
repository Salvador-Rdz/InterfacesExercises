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
public class HandyPerson  extends Human implements iPlumber, iElectrician  {

    public HandyPerson(String name)
    {
        super(name);
    }
    @Override
    public String unplugDrain() {
        return this.name+" unplugs the drain";
    }

    @Override
    public String changeBulb() {
        return this.name+" changes the bulb";
    }

    @Override
    public String toString() {
        return "HandyPerson{" + super.toString() +'}';
    }
    
}
