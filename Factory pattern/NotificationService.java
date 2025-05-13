public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory nf =  NotificationFactory.getInstance();

       Notification n =  nf.createNotification("SMS");
       n.notifyUser("Sms sent");
    }
}
