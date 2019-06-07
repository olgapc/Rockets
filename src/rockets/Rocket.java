/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockets;

/**
 *
 * @author olga
 */
public class Rocket
{

    String idRocket;
    int numThruster;

    public Rocket(String idRocket, int numThruster)
    {
        this.idRocket = idRocket;
        this.numThruster = numThruster;
    }

    public String getIdRocket()
    {
        return idRocket;
    }

    public int getNumThruster()
    {
        return numThruster;
    }

}
