public class Car {
    private String type;
    private String engine;
    private String color;
    private String fuel;

    public Car(String type, String engine, String color, String fuel) {
        this.type = type;
        this.engine = engine;
        this.color = color;
        this.fuel = fuel;
    }

    public void showSpecs() {
        System.out.println(type + " - " + engine + ", " + color + ", " + fuel);
    }
}
