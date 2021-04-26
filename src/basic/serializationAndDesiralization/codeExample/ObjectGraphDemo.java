package basic.serializationAndDesiralization.codeExample;

import java.io.*;

public class ObjectGraphDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(dog);
        /**/
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog obj = (Dog) ois.readObject();
        System.out.println("By Serialization the Dog WE can serialize the Rat Object Too" + obj.cat.rat.j);
    }
}
