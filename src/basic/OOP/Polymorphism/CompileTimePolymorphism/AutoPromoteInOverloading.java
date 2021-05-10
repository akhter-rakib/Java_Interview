package basic.OOP.Polymorphism.CompileTimePolymorphism;

public class AutoPromoteInOverloading {
    void m1(int a) {
        System.out.println("TEST" + a);
        System.out.println("Int type argument method");
    }

    void m1(float a) {
        System.out.println("float type argument method");
    }

    public static void main(String[] args) {
        AutoPromoteInOverloading obj = new AutoPromoteInOverloading();
        obj.m1('a'); //It's not given any error because compile promote the argument to next level
       /* byte -> short -> int -> long -> float -> double
        char -> -> int -> long -> float -> double*/

    }
}
