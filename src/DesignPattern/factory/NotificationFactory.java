package DesignPattern.factory;

public class NotificationFactory {
    /*This is the factory Class*/
    public Notification notification(String notificationType) {
        /*Depending on client requirement the object will be created*/
        if ("SMS".equalsIgnoreCase(notificationType)) {
            return new SmsNotification();
        } else if ("EMAIL".equalsIgnoreCase(notificationType)) {
            return new EmailNotification();
        }
        return null;
    }
}
