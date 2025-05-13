// Circle.java
public class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0; // Default value
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
