package DesignPattern.singleton;

public class SingleTonByAfterFirstRequest {
    private static SingleTonByAfterFirstRequest obj = null;

    private SingleTonByAfterFirstRequest() {

    }

    public static SingleTonByAfterFirstRequest getObject() {
        if (obj != null)
            return obj;
        return new SingleTonByAfterFirstRequest();
    }

    public void greeting() {
        System.out.println("Hello Boys");
    }
}
