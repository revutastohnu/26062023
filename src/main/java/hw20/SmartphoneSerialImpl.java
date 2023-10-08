package hw20;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SmartphoneSerialImpl extends SmartphoneSerial {
    private transient SomeNoSerial someField;

    public SmartphoneSerialImpl(SmartphoneSerial.OS os, String color, String type, SomeNoSerial someField) {
        super(os, color, type);
        this.someField = someField;
    }

    private void writeObject(ObjectOutputStream ous) throws IOException {
        ous.defaultWriteObject();
        ous.writeObject(someField.someField);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        someField = new SomeNoSerial((String) ois.readObject());
    }

    @Override
    public String toString() {
        return "SmartphoneSerialImpl {" +
                "someField=" + someField +
                '}';
    }

    public static class SomeNoSerial {
        private final String someField;

        public SomeNoSerial(String someField) {
            this.someField = someField;
        }
    }

    public SomeNoSerial getSomeField() {
        return someField;
    }
}
