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
public class MovablePoint implements Movable{ //Implements the movable interface
    //Coordinates and movement ratio
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    //Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    //Methods from the movable interface
    @Override
    public void MoveUp() {
        this.y+=this.ySpeed;
    }

    @Override
    public void MoveDown() {
        this.y-=this.ySpeed;
    }

    @Override
    public void MoveLeft() {
        this.x-=this.xSpeed;
    }

    @Override
    public void MoveRight() {
        this.x+=this.xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

}
