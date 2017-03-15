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
public class CDPlayer implements iPlayer {

    @Override
    public void play() {
        System.out.println("CDPlayer is playing");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer has stopped");
    }

    @Override
    public void pause() {
        System.out.println("CDPlayer is paused");
    }

    @Override
    public void reverse() {
        System.out.println("CDPlayer is on reverse");
    }
    
}
