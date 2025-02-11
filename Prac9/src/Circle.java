
public class Circle implements Comparable<Circle>{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public int compareTo(Circle other) {
        return (int) Double.compare(this.radius, other.radius);
    }
}
