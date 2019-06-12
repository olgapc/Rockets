/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockets;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author olga
 */
public class Rocket
{

    private String idRocket;
    private int numThruster;
    private List<Thruster> thrusters;
    private double speed;

    public Rocket(String idRocket, int numThruster, int[] args)
    {
        this.idRocket = idRocket;
        this.numThruster = numThruster;
        this.speed = 0;

        this.thrusters = new ArrayList<>();

        if (args.length != numThruster)
        {
            new Exception("numero arguments erroni");
        }
        for (int i = 0; i < numThruster; i++)
        {
            thrusters.add(new Thruster(args[i]));

        }
    }

    public List<Thruster> getThrusters()
    {
        return thrusters;
    }

    // return integer list of Thrusters power
    public List<Integer> getThrustersPower()
    {
        List<Integer> powers = new ArrayList<>();

        for (Thruster thruster : this.thrusters)
        {
            powers.add(thruster.getPower());

        }
        return powers;
    }

    //return integer list of Thrusters actual power
    public List<Integer> getThrustersActPower()
    {
        List<Integer> actPowers = new ArrayList<>();

        for (Thruster thruster : this.thrusters)
        {
            actPowers.add(thruster.getActPower());

        }
        return actPowers;
    }

    //accelerate Rocket, the power of each thruster of a rocket accelerates 10
//    public void speedUpRocket()
//    {
//
//        this.speedUp();
//
////        System.out.println("Rocket " + this.getIdRocket() + " propulsors " + this.getThrustersActPower());
////        this.setSpeed();
//    }
    public void speedUpRocket()
    {

        for (Thruster thruster : this.thrusters)
        {

            thruster.speedUpThrusters(this.getIdRocket());

        }
        System.out.println("Rocket " + this.getIdRocket() + " propulsors " + this.getThrustersActPower());
        this.setSpeed();

    }

    //slow down Rocket, the power of each thruster of a rocket decrease 10
    public void slowDownRocket()
    {
        for (Thruster thruster : this.thrusters)
        {

            thruster.slowDownThrusters();

        }

        System.out.println("Rocket " + this.getIdRocket() + " propulsors " + this.getThrustersActPower());
        this.setSpeed();
    }

    public String getIdRocket()
    {
        return idRocket;
    }

    public int getNumThruster()
    {
        return numThruster;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed()
    {
        int sumPower = 0;
        for (Thruster thruster : thrusters)
        {
            sumPower = sumPower + thruster.getActPower();
        }
        this.speed = this.speed + 100.0 * Math.sqrt(sumPower);

    }

}
