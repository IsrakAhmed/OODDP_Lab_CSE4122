// Composite - Building (top-level)
import java.util.ArrayList;
import java.util.List;
class Building implements HousingStructure {
    private String name;
    private List<HousingStructure> structures = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void showStructure() {
        System.out.println("Building: " + name);
        for (HousingStructure structure : structures) {
            structure.showStructure();
        }
    }
}