// Concrete State 3 - Item Selected
class ItemSelectedState implements State {
    private VendingMachine vendingMachine;

    public ItemSelectedState(VendingMachine machine) {
        this.vendingMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Item already selected. Dispensing item...");
    }

    @Override
    public void selectItem() {
        System.out.println("Item already selected.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Dispensing item...");
        vendingMachine.setState(vendingMachine.getWaitingForMoneyState());
    }
}