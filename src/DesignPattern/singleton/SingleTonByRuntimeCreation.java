package DesignPattern.singleton;

public class SingleTonByRuntimeCreation {

    //This instance is create during the class load
    private static SingleTonByRuntimeCreation obj = new SingleTonByRuntimeCreation();

    private SingleTonByRuntimeCreation() {
    }

    public static SingleTonByRuntimeCreation getObj() {
        return obj;
    }

    public void greeting() {
        System.out.println("Hello Boys");
    }
}
