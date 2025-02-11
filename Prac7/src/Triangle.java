import static java.lang.Math.sqrt;

public class Triangle extends GeometricObject{
    private double side1, side2, side3;

    public Triangle(int i, int i1, int i2){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException{
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            throw new IllegalTriangleException("Некорректные стороны триугольника");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setColor(color);
        this.setFilled(filled);
    }


    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getPerimeter(){
        return ((side1 + side2 + side3)/2);
    }

    public double getArea(){
        return sqrt(getPerimeter()*(getPerimeter()-side1)*
                (getPerimeter()-side2)*(getPerimeter()-side3));
    }

    public String toString(){
        return "\nТреугольник: сторона 1 = " + side1 + "\nсторона 2 = " + side2 +
                "\nсторона 3 = " + side3 + "\nПлощадь: " + getArea() + "\nПериметр: " + getPerimeter()*2 + "\nЦвет: " + getColor() +
                "\nЗаливка: " + isFilled() + "\n";
    }
}
