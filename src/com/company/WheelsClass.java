package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class WheelsClass {

    private Double diameter = 120.3;
    private Double hardness = 33.33; //Твёрдось
    private DecimalFormat df = new DecimalFormat("###.###");

    public WheelsClass() {
        Random random = new Random();
        diameter = Double.valueOf(df.format((random.nextInt(21)+5)*0.9).replace(",","."));
        hardness = Double.valueOf(df.format((random.nextInt(21)+5)*0.9).replace(",","."));
    }

    public WheelsClass(Double diameter, Double hardness) {
        this.diameter = diameter;
        this.hardness = hardness;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getHardness() {
        return hardness;
    }

    public void setHardness(Double hardness) {
        this.hardness = hardness;
    }
}
