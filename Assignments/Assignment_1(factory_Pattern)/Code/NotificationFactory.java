public class NotificationFactory {
    public Notification getNotification(String type){

        if(type == null || type.isEmpty()) return null;

        if(type.equalsIgnoreCase("PUSH")){
            return new PushNotification();
        } else if(type.equalsIgnoreCase("EMAIL")){
            return new EmailNotification();
        } else if(type.equalsIgnoreCase("SMS")){
            return new SmsNotification();
        }
        return null;
    }
}
