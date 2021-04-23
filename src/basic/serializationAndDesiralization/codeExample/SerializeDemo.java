package basic.serializationAndDesiralization.codeExample;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        /*Serialize - Convert the Object (Convert Java object to File / Network supported form)*/
        Animal animal = new Animal();
        FileOutputStream fos = new FileOutputStream("animal.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(animal);
        /*De Serialize - Convert File/ Network supported form to Java object form*/
        FileInputStream fis = new FileInputStream("animal.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Animal dso = (Animal) ois.readObject();

        System.out.println("After De Serialize " + dso.a + " " + dso.b);
    }
}
