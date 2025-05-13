// Context - Vending Machine
class VendingMachine {
    private State waitingForMoneyState;
    private State hasMoneyState;
    private State itemSelectedState;

    private State currentState;

    public VendingMachine() {
        waitingForMoneyState = new WaitingForMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        itemSelectedState = new ItemSelectedState(this);

        currentState = waitingForMoneyState; // Initial state
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getWaitingForMoneyState() {
        return waitingForMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getItemSelectedState() {
        return itemSelectedState;
    }

    // Actions
    public void insertMoney() {
        currentState.insertMoney();
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }
}