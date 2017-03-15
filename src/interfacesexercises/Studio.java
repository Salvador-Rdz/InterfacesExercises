/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

import java.util.ArrayList;

/**
 *
 * @author Salvador
 */
public class Studio  {
    ArrayList <iPlayer> playerList;
    
    public Studio()
    {
        this.playerList= new ArrayList();
    }
    
    public void addPlayer(iPlayer player)
    {
        this.playerList.add(new DVDPlayer ());
        this.playerList.add(new CDPlayer());
        this.playerList.add(player);
    }
}
