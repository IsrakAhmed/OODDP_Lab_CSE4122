// Client
public class Main {
    public static void main(String[] args) {
        RetailStore storeUSA = new RetailStoreProxy("USA");
        storeUSA.orderProduct("Laptop");

        RetailStore storeEurope = new RetailStoreProxy("Europe");
        storeEurope.orderProduct("Smartphone");

        RetailStore storeAsia = new RetailStoreProxy("Asia");
        storeAsia.orderProduct("Camera");
    }
}