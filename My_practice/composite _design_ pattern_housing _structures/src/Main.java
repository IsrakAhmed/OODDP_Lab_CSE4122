// Client
public class Main {
    public static void main(String[] args) {
        // Create Rooms
        Room room1 = new Room("Living Room");
        Room room2 = new Room("Bedroom");
        Room room3 = new Room("Kitchen");

        // Create Floors and add rooms
        Floor firstFloor = new Floor("First Floor");
        firstFloor.addStructure(room1);
        firstFloor.addStructure(room2);

        Floor secondFloor = new Floor("Second Floor");
        secondFloor.addStructure(room3);

        // Create Building and add Floors
        Building building = new Building("Dream Home");
        building.addStructure(firstFloor);
        building.addStructure(secondFloor);

        // Show the complete structure
        building.showStructure();
    }
}