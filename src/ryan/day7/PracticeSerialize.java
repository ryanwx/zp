package ryan.day7;

import ryan.day2.*;

import java.io.*;

public class PracticeSerialize {
    public static void main(String[] args) throws Exception {
        String file = "./temp/objectSerialize.object";

        Sequence sequence = new Sequence();
        Person person = new Person(new PersonEyes("blue"), new Leg(), new Heart(), sequence);
        try(OutputStream outputStream = new FileOutputStream(file)){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            writePersonToFile(objectOutputStream, person);
            objectOutputStream.flush();
            outputStream.close();
            objectOutputStream.close();
        }

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Person person1 = (Person) readPersonFromFile(objectInputStream);

        System.out.printf("check write serialize object == unSerialize object read from file, Result: %b\n", person.equals(person1));
    }

    // serializable 一个对象时，如果这个对象包含了另一个不可 serializable 的对象，那么对这个对象 serialize 将会抛出异常
    static void writePersonToFile(ObjectOutputStream objectOutputStream, Serializable o) throws Exception{
        objectOutputStream.writeObject(o);
    }

    static Object readPersonFromFile(ObjectInputStream objectInputStream) throws Exception{
        return objectInputStream.readObject();
    }
}
