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
public class TapePlayer implements iRecorder{

    @Override
    public void record() {
        System.out.println("TapePlayer is recording");
    }

    @Override
    public void play() {
        System.out.println("TapePlayer is playing");
    }

    @Override
    public void stop() {
        System.out.println("TapePlayer has stopped reproduction");
    }

    @Override
    public void pause() {
        System.out.println("TapePlayer is paused");
    }

    @Override
    public void reverse() {
        System.out.println("TapePlayer is playing back");
    }
    
}
