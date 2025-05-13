public class Main {
    public static void main(String[] args) {
        CarFactory usaFactory = new USACarFactory();
        Car usaSmall = usaFactory.createCar("small");
        Car usaSedan = usaFactory.createCar("sedan");
        Car usaLuxury = usaFactory.createCar("luxury");

        CarFactory asiaFactory = new AsiaCarFactory();

        Car asiaSmall = asiaFactory.createCar("small");
        Car asiaSedan = asiaFactory.createCar("sedan");
        Car asiaLuxury = asiaFactory.createCar("luxury");


        usaSmall.showSpecs();
        usaSedan.showSpecs();
        asiaLuxury.showSpecs();
        asiaSedan.showSpecs();
    }
}
