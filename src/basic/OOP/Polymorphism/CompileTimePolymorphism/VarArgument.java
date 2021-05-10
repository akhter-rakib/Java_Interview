package basic.OOP.Polymorphism.CompileTimePolymorphism;

public class VarArgument {
    void m1(int a){
        System.out.println("General method");
    }
    void m1(int ... i){/*Var argument method. It can be called by multiple int value include 0*/
        System.out.println("General method");
    }

    public static void main(String[] args) {
        VarArgument varArgument = new VarArgument();
        varArgument.m1();// it will ca,, the var argument method
        varArgument.m1(10, 20);
        varArgument.m1(10); // It will call the general method because var argument policy
        /*come after general so general method will be get priority here */
    }
}
