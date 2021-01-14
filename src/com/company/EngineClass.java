package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class EngineClass {

    private double volume = 10.1;
    private Integer horsepower = 72;
    private DecimalFormat df = new DecimalFormat("###.###");

    public EngineClass(){
        Random random = new Random();
        volume =Double.parseDouble(df.format((random.nextInt(21)+5)*0.9).replace(",","."));
        horsepower = random.nextInt(30)+20;
    }

    public EngineClass(double volume, Integer horsepower) {
        this.volume = volume;
        this.horsepower = horsepower;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }
}
