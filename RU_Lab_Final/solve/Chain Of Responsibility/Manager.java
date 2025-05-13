public class Manager extends AbstractOfficer{
    
    public Manager(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println(message + "Manager");
    }
}
