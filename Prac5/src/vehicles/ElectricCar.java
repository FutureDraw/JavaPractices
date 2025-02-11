package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    public String batteryCapacity;

    public ElectricCar (){
        setEngineType("Electric");
    }

    @Override
    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicaleType(){
        return "ElectricCar";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nЁмкость батареи: "
                + getBatteryCapacity()
                + "\n";
    }
}
