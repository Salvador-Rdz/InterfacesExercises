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
public class MovableRectangle implements Movable{//Implements the movable interface
   //Uses two movable points to reflect the rectangle
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    //Constructor - Has the necessary data to create two MovablePoints as parameters
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) 
    {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    //Movable methods
    @Override
    public void MoveUp() {
        this.topLeft.y+=this.topLeft.ySpeed;
        this.bottomRight.y+=this.bottomRight.ySpeed;
    }

    @Override
    public void MoveDown() {
        this.topLeft.y-=this.topLeft.ySpeed;
        this.bottomRight.y-=this.bottomRight.ySpeed;
    }

    @Override
    public void MoveLeft() {
        this.topLeft.x-=this.topLeft.xSpeed;
        this.bottomRight.x-=this.bottomRight.xSpeed;
    }
    @Override
    public void MoveRight() {
        this.topLeft.x+=this.topLeft.xSpeed;
        this.bottomRight.x+=this.bottomRight.xSpeed;
    }
    
}
