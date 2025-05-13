// Concrete State 1 - Waiting for money
class WaitingForMoneyState implements State {
    private VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine machine) {
        this.vendingMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted.");
        vendingMachine.setState(vendingMachine.getHasMoneyState());
    }

    @Override
    public void selectItem() {
        System.out.println("Please insert money first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Insert money and select item first.");
    }
}