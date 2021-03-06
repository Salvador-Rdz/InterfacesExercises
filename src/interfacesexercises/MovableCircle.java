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
public class MovableCircle implements Movable{ //Implements the "move" methods from the interface "Movable"
    int radius;
    MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed)  //Receives the data needed to create a MovablePoint
    {
        this.radius = radius;
        this.center = new MovablePoint( x,  y,  xSpeed, ySpeed); //Creates the MovablePoint
    }
    //Uses the methods from the "Movable" interface
    @Override
    public void MoveUp() {
        this.center.y+=this.center.ySpeed;
    }

    @Override
    public void MoveDown() {
        this.center.y-=this.center.ySpeed;
    }

    @Override
    public void MoveLeft() {
        this.center.x-=this.center.xSpeed;
    }

    @Override
    public void MoveRight() {
        this.center.x+=this.center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
    
}
