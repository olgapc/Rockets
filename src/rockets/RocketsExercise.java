/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockets;

import java.util.List;

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

        //powerList for rocket1
        int[] powerList1 =
        {
            10, 30, 80
        };
        //create rocket1
        Rocket rocket1 = new Rocket("32WESSDS", 3, powerList1);

        //powerList for rocket2
        int[] powerList2 =
        {
            30, 40, 50, 50, 30, 10
        };
        //create rocket2
        Rocket rocket2 = new Rocket("LDSFJA32", 6, powerList2);

        System.out.print("Coet 1: " + rocket1.getIdRocket()
                + " té " + rocket1.getNumThruster() + " propulsors");

        printThrusterPower(rocket1);

        System.out.print("\nCoet 2: " + rocket2.getIdRocket()
                + " té " + rocket2.getNumThruster() + " propulsors");

        printThrusterPower(rocket2);

        rocket1.speedUpRocket();
        rocket2.speedUpRocket();
        rocket1.speedUpRocket();
        rocket2.speedUpRocket();
        rocket2.speedUpRocket();
        rocket1.slowDownRocket();
        rocket1.slowDownRocket();

    }

    public static void printThrusterPower(Rocket rocket)
    {
        for (Thruster thruster : rocket.getThrusters())
        {
            System.out.print(", " + thruster.getPower());
        }
    }

}
