package basic.OOP.Polymorphism.CompileTimePolymorphism;

public class PriorityOfArgumentCase2 {
    void m1(String str) {
        System.out.println("String .....");
    }

    void m1(StringBuilder stringBuilder) {
        System.out.println("stringBuilder .....");
    }

    public static void main(String[] args) {
        PriorityOfArgumentCase2 obj = new PriorityOfArgumentCase2();
        /*obj.m1(null);*/ /*It will give compile time error because There is no relation between
                String and StringBuilder and both ar acceptable for null value */
    }
}
