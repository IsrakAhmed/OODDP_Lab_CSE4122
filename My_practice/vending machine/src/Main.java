// Client
public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        System.out.println("\n--- Scenario 1: Normal Flow ---");
        machine.insertMoney();
        machine.selectItem();
        machine.dispenseItem();

        System.out.println("\n--- Scenario 2: Wrong Flow (Select before inserting money) ---");
        machine.selectItem();
        machine.insertMoney();
        machine.selectItem();
        machine.dispenseItem();
    }
}