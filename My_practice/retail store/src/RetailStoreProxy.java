class RetailStoreProxy implements RetailStore {
    private RealRetailStore realStore;
    private String customerLocation;

    public RetailStoreProxy(String customerLocation) {
        this.customerLocation = customerLocation;
    }

    @Override
    public void orderProduct(String product) {
        if (customerLocation.equalsIgnoreCase("USA")) {
            System.out.println("Product '" + product + "' shipped quickly from USA regional warehouse.");
        } else if (customerLocation.equalsIgnoreCase("Europe")) {
            System.out.println("Product '" + product + "' shipped quickly from Europe regional warehouse.");
        } else {
            if (realStore == null) {
                realStore = new RealRetailStore();
            }
            realStore.orderProduct(product); // fallback to main warehouse
        }
    }
}