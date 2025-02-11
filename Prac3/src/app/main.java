package app;
import vehicles.Car;
import vehicles.ElectricCar;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Car usualCar = new Car();
    usualCar.setOwnerName("Aleksandr");
    usualCar.setInsuranceNumber("545454");
    usualCar.setEngineType("IC Engine");

    ElectricCar elecCar = new ElectricCar();
    elecCar.setOwnerName("Alikhan");
    elecCar.setInsuranceNumber("765754");
    elecCar.setBatteryCapacity("50 кВтч");

    System.out.print("Класс Car:\n" + "Владелец: " + usualCar.getOwnerName() + "\nНомер страховки: " +
            usualCar.getInsuranceNumber() + "\nТип двигателя: " + usualCar.getEngineType() + "\n\nКласс ElectricCar:\n" +
            "Владелец: " + elecCar.getOwnerName() + "\nНомер страховки: " +
            elecCar.getInsuranceNumber() + "\nТип двигателя: " + elecCar.getEngineType() + "\nЁмкость батареи: " + elecCar.getBatteryCapacity());
    }
}
