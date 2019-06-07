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
public class RocketsExercise
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Rocket rocket1 = new Rocket("32WESSDS", 3);
        Rocket rocket2 = new Rocket("LDSFJA32", 6);

        System.out.println("Coet 1: " + rocket1.getIdRocket()
                + " té " + rocket1.getNumThruster() + " propulsors");
        System.out.println("Coet 2: " + rocket2.getIdRocket()
                + " té " + rocket2.getNumThruster() + " propulsors");
    }

}
