public abstract class AbstractOfficer {

    public static int CASHIER = 1;
    public static int SENIOR_OFFICER = 2;
    public static int MANAGER = 3;

    protected int level;

    protected AbstractOfficer nextOfficer;

    public void setNextOfiicer(AbstractOfficer nextOfficer) {
        this.nextOfficer = nextOfficer;
    }

    public void statusMessage(int level, int amount) {
        if(level - this.level < 2) {
            write("The Withdraw request of amount " + Integer.toString(amount) + " is processed by ");
        }
        if(nextOfficer!=null && this.level<level) {
            String to;
            if(this.level==1)to = "Senior Officer";
            else to = "Manager";
            System.out.println("The withraw request is sending to " + to + " for processing...\n");
            
            nextOfficer.statusMessage(level, amount);
        }
        else {
            System.out.println("The withraw request is Accepted. Please collect your money.\n");
        }
    }

    public abstract void write(String msg);
    
}