package DesignPattern.singleton;

public class SingleTonByLazyWay {
    private static SingleTonByLazyWay obj = null;

    private SingleTonByLazyWay() {

    }

    public static SingleTonByLazyWay getObject() {
        if (obj != null)
            return obj;
        return new SingleTonByLazyWay();
    }

    public void greeting() {
        System.out.println("Hello Boys");
    }
}
