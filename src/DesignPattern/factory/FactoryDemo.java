package DesignPattern.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        /*Here client want to sent SMS notification*/
        Notification notification = notificationFactory.notification("SMS");
        notification.notifyToClient();
    }
}
