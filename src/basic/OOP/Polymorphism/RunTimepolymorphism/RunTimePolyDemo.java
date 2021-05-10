package basic.OOP.Polymorphism.RunTimepolymorphism;

public class RunTimePolyDemo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal tiger = new Tiger();
        animal.eat();
        tiger.eat();
    }
}
