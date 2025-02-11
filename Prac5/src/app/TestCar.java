package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car usualCar = new Car();
        ElectricCar elecCar = new ElectricCar();

        //Класс Car
        usualCar.setModel("BMW");
        usualCar.setLicense("В228АВ");
        usualCar.setColor("black");
        usualCar.setYear(2021);
        usualCar.setOwnerName("Aleksandr");
        usualCar.setInsuranceNumber("545454");

        //Класс ElectricCar
        elecCar.setModel("Audi");
        elecCar.setLicense("А433ФД");
        elecCar.setColor("red");
        elecCar.setYear(2018);
        elecCar.setOwnerName("Alixanus");
        elecCar.setInsuranceNumber("765754");
        elecCar.setBatteryCapacity("50 кВтч");


        System.out.print(usualCar);
        System.out.print("\n\n");
        System.out.print(elecCar);

    }
}
