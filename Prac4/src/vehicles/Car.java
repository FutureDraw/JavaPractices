package vehicles;

public class Car extends Vehicle{

    public Car(){
        setEngineType("IC Engine");
    }

    @Override
    public String vehicaleType() {
        return "Car";
    }
}
