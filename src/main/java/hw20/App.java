package hw20;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("source.txt"))) {
            SmartphoneSerialImpl ts = new SmartphoneSerialImpl(SmartphoneSerial.OS.iOS, "black", "iPhone 8", new SmartphoneSerialImpl.SomeNoSerial("check if this works"));
            oos.writeObject(ts);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        try {
            Path src = Paths.get("source.txt");
            Path dest = Paths.get("moved.txt");
            Files.move(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream("moved.txt"))) {
            SmartphoneSerialImpl car = (SmartphoneSerialImpl) oin.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}


