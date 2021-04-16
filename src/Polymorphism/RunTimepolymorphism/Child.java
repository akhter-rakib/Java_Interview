package Polymorphism.RunTimepolymorphism;

public class Child extends Parent {

    @Override
    public void marry() {
        System.out.println("Will marry the Hasina");
    }

    public static void main(String[] args) {
        new Child().marry();
    }
}
