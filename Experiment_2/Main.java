/* 

    2. PET Management System.

    Write a Java program to demonstrate a PET management system, which could be a PET shop, PET care,
    or PET service. Ensure you follow appropriate object-oriented design concepts while implementing the tasks.
    
*/

public class Main {
    public static void main(String[] args) {

        Pet cat1 = new Pet("Cat", 2, 5.0, "Persian", 5000.0);
        Pet dog1 = new Pet("Dog", 3, 10.0, "Labrador", 10000.0);
        Pet bird1 = new Pet("Bird", 1, 0.5, "Parrot", 2000.0);

        PetShop petShop = new PetShop();

        petShop.addPet(cat1);
        petShop.addPet(dog1);
        petShop.addPet(bird1);

        Customer customer1 = new Customer("Israk Ahmed", "Bogra", "1234567890");
        petShop.sellPet(customer1, cat1, cat1.getPrice());

        Customer customer2 = new Customer("Esrat Jahan", "Bogura", "0987654321");
        petShop.sellPet(customer2, bird1, bird1.getPrice());

        petShop.showAvailablePets();
        petShop.showSales();
    }
}