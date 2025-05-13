public class NotificationFactoryDemo {

   public static void main(String[] args) {
      NotificationFactory nf = new NotificationFactory();

      Notification email = nf.getNotification("EMAIL");
      email.notifyUser();

      Notification sms = nf.getNotification("SMS");
      sms.notifyUser();

      Notification push = nf.getNotification("PUSH");
      push.notifyUser();

   }
}