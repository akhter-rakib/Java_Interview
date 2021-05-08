package Polymorphism.RunTimepolymorphism;

public class CovariantReturnType extends Parent {
    @Override
    public String coveriantMethod() { //Here We have changed the return type and it is child of Object class
        return null;
    }

    public static void main(String[] args) {
        CovariantReturnType obj = new CovariantReturnType();
        obj.coveriantMethod();

    }
}
