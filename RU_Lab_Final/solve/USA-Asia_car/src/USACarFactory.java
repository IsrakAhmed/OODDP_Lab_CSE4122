public class USACarFactory implements CarFactory {
    public Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "small": return new Car("USA Small Car", "1.0L", "Red", "Petrol");
            case "sedan": return new Car("USA Sedan Car", "2.0L", "Blue", "Petrol");
            case "luxury": return new Car("USA Luxury Car", "3.5L", "Black", "Petrol");
            default: return null;
        }
    }
}
