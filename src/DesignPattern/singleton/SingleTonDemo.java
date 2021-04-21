package DesignPattern.singleton;

public class SingleTonDemo {
    public static void main(String[] args) {
        SingleTonByRuntimeCreation obj = SingleTonByRuntimeCreation.getObj();
        obj.greeting();
        SingleTonByLazyWay obj2 = SingleTonByLazyWay.getObject();
        obj2.greeting();
    }
}
