// Rectangle.java
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 2.0;   // Default value
        this.height = 1.5;  // Default value
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
