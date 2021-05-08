package Polymorphism.RunTimepolymorphism;

public class VarArgDemo extends Account {
    public void varArg(int i) {
        System.out.println("Child Class ..");
    }

    public static void main(String[] args) {
        Account account = new Account();
        VarArgDemo varArgDemo = new VarArgDemo();
        Account account1 = new VarArgDemo();
        account.varArg(10);
        varArgDemo.varArg(20);
        account1.varArg(30); // So it is not overridden method for this causes reference type method will be executed

    }
}
