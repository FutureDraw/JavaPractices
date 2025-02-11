public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(){
        this.side = -1;
    }

    public Square(double side) throws IllegalSquareException{
        if (side <= 0){
            throw new IllegalSquareException("Нечего расскрашивать");
        }
        this.side = side;
        howToColor();
    }


    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void howToColor() throws IllegalSquareException{
        System.out.print("\nРаскрасьте все четыре стороны.");
    }
}
