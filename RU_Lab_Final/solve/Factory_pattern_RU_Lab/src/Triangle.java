// Triangle.java
public class Triangle implements Shape {
    private double a, b, c;

    public Triangle() {
        this.a = 2.0; // Default values
        this.b = 1.5;
       // this.c = 5.0;

        //width ke dhorlam a = 2 ------>       this.a = 2;
        // height ke dhorlam b = 1.5 -------->  this.b = 1.5;
        // area of triangle  = 0.5 * a * b

    }

    @Override
    public double getArea() {
       // double s = (a + b + c) / 2;
        //return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return 0.5*a*b;
    }
}
