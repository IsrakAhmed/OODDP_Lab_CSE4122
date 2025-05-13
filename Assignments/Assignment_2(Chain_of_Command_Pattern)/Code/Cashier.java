class Cashier extends Approver {
    public void handleRequest(double amount) {
        if (amount < 10000) {
            System.out.println("Cashier: Approved withdrawal of Tk. " + amount);
        } else {
            System.out.println("Cashier: Approved and Forwarding request...");
            if (next != null) next.handleRequest(amount);
        }
    }
}