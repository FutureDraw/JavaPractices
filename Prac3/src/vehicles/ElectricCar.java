package vehicles;

public class ElectricCar extends Car{
    public String batteryCapacity;

    public ElectricCar (){
        setEngineType("Electric");
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public String getBatteryCapacity(){
        return batteryCapacity;
    }
}
