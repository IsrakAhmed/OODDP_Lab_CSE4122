// Leaf - Simple element
class Room implements HousingStructure {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void showStructure() {
        System.out.println("Room: " + name);
    }
}