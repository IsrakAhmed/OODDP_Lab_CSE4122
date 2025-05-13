// Client
public class Main{
    public static void main(String[] args) {
        BankServiceFacade bankService = new BankServiceFacade();

        System.out.println("Opening only Checking Account:");
        bankService.openCheckingService();

        System.out.println("\nOpening only Saving Account:");
        bankService.openSavingService();

        System.out.println("\nOpening only Saving Account:");
        bankService.openInvestmentService();

        System.out.println("\nOpening all Services together:");
        bankService.openAllServices();
    }
}