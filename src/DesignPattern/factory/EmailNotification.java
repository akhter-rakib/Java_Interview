package DesignPattern.factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyToClient() {
        System.out.println("Email to Clients");
    }
}
