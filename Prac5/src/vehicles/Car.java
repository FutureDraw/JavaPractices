package vehicles;

public class Car extends Vehicle{

    public Car(){
        setEngineType("Combustion");
    }

    @Override
    public String vehicaleType() {
        return "Car";
    }
}
