package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class TruckClass extends CarClass{

    private final Double liftingСapacity; //В тоннах
    private DecimalFormat df = new DecimalFormat("###.###");

    public TruckClass(WheelsClass wheels, OwnerClass owner, EngineClass engine){
        super(wheels,owner,engine);
        Random random = new Random();
        this.liftingСapacity = Double.valueOf(df.format((random.nextInt(21)+5)*0.9).replace(",","."));
    }

    public Double getLiftingСapacity() {
        return liftingСapacity;
    }
}
