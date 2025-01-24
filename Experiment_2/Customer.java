import java.util.ArrayList;

public class Customer {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Pet> pets = new ArrayList<Pet>();

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void showPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Customer\n{\n")
          .append("\tName = '").append(name).append('\'')
          .append("\n\tAddress = '").append(address).append('\'')
          .append("\n\tPhone = '").append(phone).append('\'')
          .append("\n\tPets = [");

        for (Pet pet : pets) {
            sb.append("\n\t\t").append(pet);
        }

        sb.append("\n\t]\n}");

        return sb.toString();
    }
}
