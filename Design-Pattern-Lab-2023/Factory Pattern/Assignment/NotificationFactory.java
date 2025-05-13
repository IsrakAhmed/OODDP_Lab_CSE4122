public class NotificationFactory{
    public Notification getNotification(String notificationType){
      if(notificationType == null){
         return null;
      }		
      if(notificationType.equalsIgnoreCase("EMAIL")){
         return new EmailNotification();
         
      } else if(notificationType.equalsIgnoreCase("SMS")){
         return new SMSNotification();
         
      } else if(notificationType.equalsIgnoreCase("Push")){
         return new PushNotification();
      }
      
      return null;
   }
}