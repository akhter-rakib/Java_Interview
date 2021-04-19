package DesignPattern.singleton;

public class SingleTonDemo {
    public static void main(String[] args) {
        SingleTonByRuntimeCreation obj = SingleTonByRuntimeCreation.getObj();
        obj.greeting();
        SingleTonByAfterFirstRequest obj2 = SingleTonByAfterFirstRequest.getObject();
        obj2.greeting();
    }
}
