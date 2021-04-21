package DesignPattern.factory;

public class SmsNotification implements Notification {
    @Override
    public void notifyToClient() {
        System.out.println("Sending sms To Clients");
    }
}
