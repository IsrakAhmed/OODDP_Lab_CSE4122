class RealRetailStore implements RetailStore {
    @Override
    public void orderProduct(String product) {
        System.out.println("Product '" + product + "' ordered directly from the main warehouse.");
    }
}