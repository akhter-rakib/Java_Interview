package basic.OOP.Polymorphism.CompileTimePolymorphism;

public class CompileTimeUseRefTypeMethodCallDemo {

    public void m1(Animal animal) {
        System.out.println("Animal Version");
    }

    public void m1(Monkey monkey) {
        System.out.println("Monkey Version");
    }

    public static void main(String[] args) {
        CompileTimeUseRefTypeMethodCallDemo obj = new CompileTimeUseRefTypeMethodCallDemo();
        Animal animal = new Monkey();
        obj.m1(animal); //Here Animal version will be called because compile call the
        // method of ref type in Overloading

    }
}
