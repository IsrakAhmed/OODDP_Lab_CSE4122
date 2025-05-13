// Concrete State 2 - Money has been inserted
class HasMoneyState implements State {
    private VendingMachine vendingMachine;

    public HasMoneyState(VendingMachine machine) {
        this.vendingMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money already inserted.");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected.");
        vendingMachine.setState(vendingMachine.getItemSelectedState());
    }

    @Override
    public void dispenseItem() {
        System.out.println("Select item first.");
    }
}