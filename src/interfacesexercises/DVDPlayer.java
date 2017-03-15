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
public class DVDPlayer implements iPlayer{ //implements iPlayer
    //iPlayer's methods, prints the current state of the DVDPlayer
    @Override
    public void play() {
        System.out.println("DVDPlayer is playing");
    }

    @Override
    public void stop() {
        System.out.println("DVDPlayer has stopped");
    }

    @Override
    public void pause() {
        System.out.println("DVDPlayer is paused");
    }

    @Override
    public void reverse() {
        System.out.println("DVDPlayer is on playback");
    }
    
}
