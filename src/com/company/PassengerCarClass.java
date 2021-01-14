package com.company;

public class PassengerCarClass extends CarClass{

    private Integer countPassengers;

    public PassengerCarClass(WheelsClass wheels, OwnerClass owner, EngineClass engine, Integer countPassengers) {
        super(wheels, owner, engine);
        this.countPassengers = countPassengers;
    }

    public Integer getCountPassengers() {
        return countPassengers;
    }
}
