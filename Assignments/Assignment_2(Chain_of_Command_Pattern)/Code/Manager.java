class Manager extends Approver {
    public void handleRequest(double amount) {
        if (amount > 1000000) {
            System.out.println("Manager: Approved withdrawal of Tk. " + amount);
        } else {
            System.out.println("Manager: No further processing required.");
        }
    }
}