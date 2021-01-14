package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    private static Queue<CarClass> queueCar = new LinkedList<>();

    public static void main(String[] args) {
        Random random = new Random();
        int countCar = random.nextInt(100) + 20;
        for (int i = 0; i < countCar; i++) {
            switch (random.nextInt(2)) {
                case 0:
                    queueCar.add(new TruckClass(new WheelsClass(), new OwnerClass(), new EngineClass()));
                    break;
                case 1:
                    queueCar.add(new PassengerCarClass(new WheelsClass(), new OwnerClass(), new EngineClass(), random.nextInt(4) + 1));
                    break;
            }
        }
        Integer passCount = 0;
        Double mass = 0.0;
        System.out.println("Список машин: ");
        System.out.println("\n===============================================================================================================\n");
        while (!queueCar.isEmpty()) {
            CarClass currentCar = queueCar.remove();
            System.out.println("Машина принадлежит владельцу: "
                    + currentCar.getOwner().getSurname() + " "
                    + currentCar.getOwner().getName() + " "
                    + currentCar.getOwner().getSurname() + "\n"
                    + "Двигатель у машины объёмом: "
                    + currentCar.getEngine().getVolume() + "\n"
                    + "В двигателе " + currentCar.getEngine().getHorsepower() + " лошадиных сил \n"
                    + "Колёса у машины диаметром " + currentCar.getWheels().getDiameter() + "\n"
                    + "Твёрдость колёс " + currentCar.getWheels().getHardness());
            if (currentCar instanceof TruckClass) {
                mass += ((TruckClass) currentCar).getLiftingСapacity();
                System.out.println("Грузоподъёмность " + ((TruckClass) currentCar).getLiftingСapacity());
            } else {
                passCount += ((PassengerCarClass) currentCar).getCountPassengers();
                System.out.println("Пассажировместимость " + ((PassengerCarClass) currentCar).getCountPassengers());
            }
            System.out.println("\n===============================================================================================================\n");
        }
        System.err.println("Общее количество пассажиров легковых автомобилях: " + passCount);
        System.err.println("Общая грузоподъёмность грузовых автомобилей: " + String.format("%.3f", mass) + " тонн");
    }
}
