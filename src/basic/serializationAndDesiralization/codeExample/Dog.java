package basic.serializationAndDesiralization.codeExample;


import java.io.Serializable;

public class Dog implements Serializable {
    Cat cat = new Cat();
}
