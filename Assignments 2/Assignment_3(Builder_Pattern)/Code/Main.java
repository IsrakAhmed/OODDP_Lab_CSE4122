public class Main {
    public static void main(String[] args) {
        Car defaultCar = new CarBuilder().build();
        System.out.println("Default Car Configuration:\n" + defaultCar);

        // Car customCar = new CarBuilder()
        //     .setModelName("Tesla Model 3")
        //     .setEngineType("Electric")
        //     .setColor("Red")
        //     .setTransmission("Automatic")
        //     .setSunroof(true)
        //     .setInfotainmentSystem(true)
        //     .build();
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setModelName("Tesla Model 3");
        carBuilder.setEngineType("Electric");
        carBuilder.setColor("Red");
        carBuilder.setTransmission("Automatic");
        carBuilder.setSunroof(true);
        carBuilder.setInfotainmentSystem(true);
        Car customCar = carBuilder.build();

        System.out.println("\nCustomized Car Configuration:\n" + customCar);
    }
}
