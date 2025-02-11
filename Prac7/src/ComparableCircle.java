public class ComparableCircle extends Circle implements Comparable{
    public double compareTo(GeometricObject obj1, GeometricObject obj2){
        if (obj1.getArea() > obj2.getArea()){
            return obj1.getArea();
        }
        return obj2.getArea();
    }
}
