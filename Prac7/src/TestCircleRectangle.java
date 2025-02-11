public class TestCircleRectangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Circle circle = new Circle(1);
        System.out.println("Круг " + circle.toString());
        System.out.println("Радиус равен " + circle.getRadius());
        System.out.println("Площадь равна " + circle.getArea());
        System.out.println("Диаметр равен " + circle.getDiameter());
        Circle circle2 = new Circle(3);
        System.out.println("Больше круг с площадью: " + GeometricObject.max(circle, circle2));

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nПрямоугольник " + rectangle.toString());
        System.out.println("Площадь равна " + rectangle.getArea());
        System.out.println("Периметр равен " +
                rectangle.getPerimeter());
        Rectangle rectangle2 = new Rectangle(2, 8);
        System.out.println("Больше прямоугольник с площадью: " + GeometricObject.max(rectangle, rectangle2));


        ComparableCircle comparableCircle = new ComparableCircle();
        System.out.println("\n\n\nБольше фигура с площадью: " + comparableCircle.compareTo(circle, rectangle));


        Triangle triangle = new Triangle(1, 2, 3, "белый", true);
        System.out.println(triangle.toString());
    }
}