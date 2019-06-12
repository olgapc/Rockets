/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockets;

import java.util.UUID;

/**
 *
 * @author olga
 */
public class Thruster
{

    private UUID idThruster;
    int maxPower;
    int actPower;

    public Thruster(int power)
    {
        this.idThruster = UUID.randomUUID();
        this.maxPower = power;
        this.actPower = 0;

    }

    public int getPower()
    {
        return maxPower;
    }

    public UUID getIdThruster()
    {
        return idThruster;
    }

    public int getMaxPower()
    {
        return maxPower;
    }

    public int getActPower()
    {
        return actPower;
    }

    public void speedUpThrusters(String idRocket)
    {

        Runnable r1 = () ->
        {
            int increase = 10;
            int speed = this.actPower + increase;
            if (speed <= this.maxPower)
            {
                this.actPower = speed;
                System.out.println("\naccelerant " + idRocket + " potència: " + this.actPower);

            } else
            {
                System.out.println("\nPropulsor a la màxima potència, no es pot accelerar més");
            }
        };

        Thread t = new Thread(r1);

        t.start();
    }

    public void slowDownThrusters()
    {

        Runnable r2 = () ->
        {
            int decrease = 10;
            int speed = this.actPower - decrease;
            if (speed >= 0)
            {
                this.actPower = speed;
                System.out.println("\nfrenant " + this.idThruster + " potència: " + this.actPower);

            } else
            {
                System.out.println("\nPropulsor parat");
            }
        };
        Thread t = new Thread(r2);

        t.start();

    }

}
