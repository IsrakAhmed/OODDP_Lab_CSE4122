// Main.java
public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        try {
            Shape circle = factory.createShape("circle");
            Shape rectangle = factory.createShape("rectangle");
            Shape triangle = factory.createShape("triangle");

            System.out.println("Circle Area: " + circle.getArea());
            System.out.println("Rectangle Area: " + rectangle.getArea());
            System.out.println("Triangle Area: " + triangle.getArea());
        } catch (Exception e){
            System.out.println("No Shape Found");
        }
    }
}
