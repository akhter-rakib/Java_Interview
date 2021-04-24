package basic.serializationAndDesiralization.codeExample;

import java.io.Serializable;

public class Animal implements Serializable {
    int a = 10;
    int b = 20;
    /*Using the access modifier transient We can avoid this value in serialization part. Default value will be show*/
    transient int c = 30;
    /*transient will not make effect in the static and final variable*/
    transient static int d = 40;
    transient final int e = 50;

    public static void main(String[] args) {
        System.out.println("Hello Bangladesh");
    }
}
