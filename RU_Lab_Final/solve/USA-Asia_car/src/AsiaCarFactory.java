public class AsiaCarFactory implements CarFactory {
    public Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "small": return new Car("Asia Small Car", "0.8L", "White", "Electric");
            case "sedan": return new Car("Asia Sedan Car", "1.5L", "Silver", "Hybrid");
            case "luxury": return new Car("Asia Luxury Car", "2.5L", "Champagne", "Hybrid");
            default: return null;
        }
    }
}
