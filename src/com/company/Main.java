package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static ArrayList<CarClass> queueCar = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();
        int countCar = random.nextInt(5)+1;
        for (int i=0;i<countCar;i++){
            switch (random.nextInt(2)){
                case 0:
                    queueCar.add(new TruckClass(new WheelsClass(),new OwnerClass(), new EngineClass()));
                    break;
                case 1:
                    queueCar.add(new PassengerCarClass(new WheelsClass(),new OwnerClass(), new EngineClass(),random.nextInt(4)+1));
                    break;
            }
        }
        System.out.println("Список машин: ");
        System.out.println("\n===============================================================================================================\n");
        for (int i=0;i<queueCar.size();i++){
            CarClass currentCar = queueCar.get(i);
            System.out.println("Машина принадлежит владельцу: "
                    + currentCar.getOwner().getSurname() + " "
                    + currentCar.getOwner().getName() + " "
                    + currentCar.getOwner().getSurname() + "\n"
                    + "Двигатель у машины объёмом: "
                    + currentCar.getEngine().getVolume() + "\n"
                    + "В двигателе " + currentCar.getEngine().getHorsepower() + " лошадиных сил \n"
                    + "Колёса у машины диаметром " + currentCar.getWheels().getDiameter() + "\n"
                    + "Твёрдость колёс " + currentCar.getWheels().getHardness());
            if(currentCar instanceof TruckClass){
                System.out.println("Грузоподъёмность " + ((TruckClass) currentCar).getLiftingСapacity() );
            } else {
                System.out.println("Пассажировместимость " + ((PassengerCarClass) currentCar).getCountPassengers() );
            }
            System.out.println("\n===============================================================================================================\n");
        }
        Integer passCount=0;
        Double mass=0.0;
        for (int i=0;i<queueCar.size();i++){
            if(queueCar.get(i) instanceof TruckClass){
                mass+=((TruckClass) queueCar.get(i)).getLiftingСapacity();
            } else {
                passCount+=((PassengerCarClass) queueCar.get(i)).getCountPassengers();
            }
        }
        System.err.println("Общее количество пассажиров легковых автомобилях: " + passCount);
        System.err.println("Общая грузоподъёмность грузовых автомобилей: " + mass);
    }
}
