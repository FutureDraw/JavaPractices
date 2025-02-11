import java.util.Scanner;

class Car{
    public String model, license, color;
    public int year;

    public Car(String model, String license, String color, int year){
        setModel(model);
        setLicense(license);
        setColor(color);
        setYear(year);
    }

    public Car(){
        model = "BMW";
        license = "В229АВ";
        color = "Yellow";
        year = 2021;
    }

    public Car(String model, String color){
        setModel(model);
        license = "Ф455ДД";
        setColor(color);
        year = 2003;
    }

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

    public int ageCar(){
        return 2024 - year;
    }

    public void To_String(){
        System.out.println("Модель машины: " + getModel() + " Номер машины: " + getLicense() +
                " Цвет машины: " + getColor() + " Год выпуска машины: " + getYear()
                + " Возраст автомобиля: " + ageCar() +"\n");
    }
}
public class Main {
    public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);

    String model, license, color;
    int year;

    System.out.print("Введите модель автомобиля >> ");
    model = scann.nextLine();
    System.out.print("Введите номер автомобиля >> ");
    license = scann.nextLine();
    System.out.print("Введите цвет автомобиля >> ");
    color = scann.nextLine();
    System.out.print("Введите год автомобиля >> ");
    year = scann.nextInt();

    Car BMW = new Car();
    System.out.print("Первый конструктор:\n");
    BMW.To_String();

    Car unidentifiedcar = new Car(model, license, color, year);
    System.out.print("Второй конструктор:\n");
    unidentifiedcar.To_String();

    Car unidentifiedcar2 = new Car(model, color);
    System.out.print("Третий конструктор:\n");
    unidentifiedcar2.To_String();

    }
}