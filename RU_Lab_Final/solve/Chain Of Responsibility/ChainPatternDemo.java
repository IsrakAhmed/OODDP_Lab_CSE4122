import java.util.Scanner;

public class ChainPatternDemo {
    
    private static AbstractOfficer getChainOfOfficers() {
        AbstractOfficer cashier = new Cashier(AbstractOfficer.CASHIER);
        AbstractOfficer seniorOfficer = new SeniorOfficer(AbstractOfficer.SENIOR_OFFICER);
        AbstractOfficer manager = new Manager(AbstractOfficer.MANAGER);

        cashier.setNextOfiicer(seniorOfficer);
        seniorOfficer.setNextOfiicer(manager);

        return cashier;
    }

    public static void main(String[] args) {
        AbstractOfficer officer = getChainOfOfficers();

        boolean shouldContinue = false;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount to withdraw: ");
            int amount = sc.nextInt();
            System.out.println("Please Wait. Your Withdrawal request is processing...\n");

            if(amount < 10000) {
                officer.statusMessage(AbstractOfficer.CASHIER, amount);
            }
            else if(amount >= 10000 && amount < 1000000) {
                officer.statusMessage(AbstractOfficer.SENIOR_OFFICER, amount);
            }
            else {
                officer.statusMessage(AbstractOfficer.MANAGER, amount);
            }
            System.out.println("Do you want to withdraw more amount? (yes/no): ");
            String respose = sc.next();
            if (respose.equalsIgnoreCase("Yes")) shouldContinue = true;
            else {
                shouldContinue = false;
                sc.close();
            }

        }while(shouldContinue);

    }

}
