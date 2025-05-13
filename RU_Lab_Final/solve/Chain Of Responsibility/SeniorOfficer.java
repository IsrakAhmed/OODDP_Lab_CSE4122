public class SeniorOfficer extends AbstractOfficer{
   
    public SeniorOfficer(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println(message + "Senior Officer.\n");
    }
    
}
