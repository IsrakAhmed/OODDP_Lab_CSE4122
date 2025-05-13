
public class PetShop {
    private String shopName;

    public PetShop(String shopName) {
        this.shopName = shopName;
    }

    public void sellPet(Pet pet) {
        System.out.println("Selling pet: " + pet);
    }

    public String getShopName() {
        return shopName;
    }
}
