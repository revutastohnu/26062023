package HW16;

import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        TestRunner.start(TestClass.class);
    }
}
