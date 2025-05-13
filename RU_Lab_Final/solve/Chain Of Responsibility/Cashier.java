public class Cashier extends AbstractOfficer{
    
    public Cashier(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println(message + "Cashier\n");
    }
    
}
