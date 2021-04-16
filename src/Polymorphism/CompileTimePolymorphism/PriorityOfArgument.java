package Polymorphism.CompileTimePolymorphism;

public class PriorityOfArgument {
    void m1(Object obj) {
        System.out.println("Object type argument");
    }

    void m1(String str) {
        System.out.println("String Type Argument");
    }

    public static void main(String[] args) {
        PriorityOfArgument obj = new PriorityOfArgument();
        /*  in Overlaoding exact match will get highest priority but if parent and child argument is present then
         * child class get priority */
        obj.m1(null);// In this case in overloading child class will be got more priority
    }
}
