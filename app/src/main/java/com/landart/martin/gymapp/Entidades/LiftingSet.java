package com.landart.martin.gymapp.Entidades;

import java.sql.Date;

/**
 * Created by martin on 08/04/17.
 */

public class LiftingSet {
    private Lift lift;
    private double weight;
    private int reps;
    private int sets;
    private int rpe;
    private Date date;


    //methods
    public double getLiftingVolume(){
        return weight*reps*sets;
    }

    public int getRepVolume(){
        return reps*sets;
    }

    public double get1RM(  ){
        return 0;
    }
}
