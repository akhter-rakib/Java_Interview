package Polymorphism.CompileTimePolymorphism;

public class ReferenceTypePriority {
    void m1(Animal animal) {
        animal.eat();
    }

    void m1(Monkey monkey) {
        monkey.eat();
    }

    public static void main(String[] args) {
        ReferenceTypePriority obj = new ReferenceTypePriority();
        Animal animal = new Animal();
        Monkey monkey = new Monkey();
        Animal ani = new Monkey();
        obj.m1(animal);
        obj.m1(monkey);
        obj.m1(ani);  /*Here the Animal type method will be called to ensure it please debug because
        here I have also overriding the eat method from animal so result will confuse you */
    }
}
