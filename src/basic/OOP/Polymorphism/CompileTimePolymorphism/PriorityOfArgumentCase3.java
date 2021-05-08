package Polymorphism.CompileTimePolymorphism;

public class PriorityOfArgumentCase3 {
    void m1(int a, float b) {
        System.out.println("int - float version");
    }

    void m1(float b, int a) {
        System.out.println("float - int version");
    }

    public static void main(String[] args) {
        PriorityOfArgumentCase3 obj = new PriorityOfArgumentCase3();
       /* obj.m1(10, 10);*//*ambigious problem will be occured because we may say first argument can mathc
                then secount argument will be autometicallu promoted or some say right argument match
                and first argument will be promoted . so here will be conflict*/
    }
}
