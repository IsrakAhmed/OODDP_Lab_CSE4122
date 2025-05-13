// PetManagementSystem.java
public class Main {
    public static void main(String[] args) {
        // Create instances of pets
        Pet dog = new Pet("Buddy", "Dog", 3);
        Pet cat = new Pet("Whiskers", "Cat", 2);

        // Create a pet shop
        PetShop petShop = new PetShop("Happy Paws");

        // Sell pets from the shop
        petShop.sellPet(dog);
        petShop.sellPet(cat);

        // Create a pet care instance
        PetCare petCare = new PetCare();

        // Groom and feed pets
        petCare.groomPet(dog);
        petCare.feedPet(cat);

        // Create a pet service instance
        PetService petService = new PetService();

        // Provide veterinary services for pets
        petService.provideVeterinaryService(dog);
        petService.provideVeterinaryService(cat);
    }
}
