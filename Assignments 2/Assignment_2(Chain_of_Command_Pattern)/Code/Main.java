public class Main {
    public static void main(String[] args) {
        Approver cashier = new Cashier();
        Approver seniorOfficer = new SeniorOfficer();
        Approver manager = new Manager();

        // Set chain
        cashier.setNext(seniorOfficer);
        seniorOfficer.setNext(manager);

        // Test cases
        System.out.println("Withdraw Tk. 5,000:");
        cashier.handleRequest(5000);

        System.out.println("\nWithdraw Tk. 200,000:");
        cashier.handleRequest(200000);

        System.out.println("\nWithdraw Tk. 2,000,000:");
        cashier.handleRequest(2000000);
    }
}
