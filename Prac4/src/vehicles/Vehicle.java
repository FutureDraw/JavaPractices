package vehicles;

abstract class Vehicle {
    public String model, license, color;
    int year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public String getModel(){
        return model;
    }
    public String getLicense(){
        return license;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getOwnerName(){
        return ownerName;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public abstract String vehicaleType();

    public String toString(){
        return  "\nМодель: "
                + getModel() + "\nНомер: "
                + getLicense() + "\nЦвет: "
                + getColor() + "\nГод: "
                + getYear() + "\nИмя владельца: "
                + getOwnerName() + "\nСтраховой номер: "
                + getInsuranceNumber() + "\nТип двигателя: "
                + getEngineType();
    }
}
