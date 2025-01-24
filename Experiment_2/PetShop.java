import java.util.ArrayList;

public class PetShop {

    private ArrayList<Pet> availablePets = new ArrayList<Pet>();
    private ArrayList<Sale> sales = new ArrayList<Sale>();

    public void addPet(Pet pet) {
        availablePets.add(pet);
    }

    public void showAvailablePets() {
        for (Pet pet : availablePets) {
            System.out.println(pet);
        }
    }

    public void sellPet(Customer customer, Pet pet, double price) {
        Sale sale = new Sale(customer, pet, price);
        sales.add(sale);
        availablePets.remove(pet);
        customer.addPet(pet);
    }

    public void showSales() {
        for (Sale sale : sales) {
            System.out.println(sale);
        }
    }
    
}
