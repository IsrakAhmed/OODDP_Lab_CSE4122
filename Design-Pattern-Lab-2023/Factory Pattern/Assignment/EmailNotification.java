public class EmailNotification implements Notification {

   @Override
   public void notifyUser() {
      System.out.println("Sending Notification via Email");
   }
}