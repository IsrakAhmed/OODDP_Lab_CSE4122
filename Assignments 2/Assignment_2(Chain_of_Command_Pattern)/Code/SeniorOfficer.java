class SeniorOfficer extends Approver {
    public void handleRequest(double amount) {
        if (amount <= 1000000) {
            System.out.println("Senior Officer: Approved withdrawal of Tk. " + amount);
        } else {
            System.out.println("Senior Officer: Approved and Forwarding request...");
            if (next != null) next.handleRequest(amount);
        }
    }
}