package com.company;

public class CarClass {

    protected WheelsClass wheels = new WheelsClass();
    protected OwnerClass owner = new OwnerClass();
    protected EngineClass engine = new EngineClass();

    public CarClass() {
    }

    public CarClass(WheelsClass wheels, OwnerClass owner, EngineClass engine) {
        this.wheels = wheels;
        this.owner = owner;
        this.engine = engine;
    }

    public WheelsClass getWheels() {
        return wheels;
    }

    public void setWheels(WheelsClass wheels) {
        this.wheels = wheels;
    }

    public OwnerClass getOwner() {
        return owner;
    }

    public void setOwner(OwnerClass owner) {
        this.owner = owner;
    }

    public EngineClass getEngine() {
        return engine;
    }

    public void setEngine(EngineClass engine) {
        this.engine = engine;
    }

}
