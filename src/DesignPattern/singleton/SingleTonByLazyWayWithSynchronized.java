package DesignPattern.singleton;

public class SingleTonByLazyWayWithSynchronized {
    private static SingleTonByLazyWayWithSynchronized obj = null;

    private SingleTonByLazyWayWithSynchronized() {

    }

    /*Only one thread can execute this at a time*/
    public static synchronized SingleTonByLazyWayWithSynchronized getInstance() {
        if (obj != null)
            return obj;
        else
            return new SingleTonByLazyWayWithSynchronized();
    }
}
