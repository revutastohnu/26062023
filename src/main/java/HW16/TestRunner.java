package HW16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestRunner {
    public static void start(Class<?> testClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {

        Object testInstance = testClass.newInstance();

        Method[] methods = testClass.getDeclaredMethods();


        List<Method> beforeSuiteMethods = new ArrayList<>();
        List<Method> testMethods = new ArrayList<>();
        List<Method> afterSuiteMethods = new ArrayList<>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(TestClass.BeforeSuite.class)) {
                beforeSuiteMethods.add(method);
            } else if (method.isAnnotationPresent(TestClass.Test.class)) {
                testMethods.add(method);
            } else if (method.isAnnotationPresent(TestClass.AfterSuite.class)) {
                afterSuiteMethods.add(method);
            }
        }

        testMethods.sort(Comparator.comparingInt(method -> {
            TestClass.Test annotation = method.getAnnotation(TestClass.Test.class);
            if (annotation != null) {
                return annotation.priority();
            } else {
                return 0;
            }
        }));

        if (beforeSuiteMethods.size() > 1 || afterSuiteMethods.size() > 1) {
            throw new RuntimeException("Only one @BeforeSuite and @AfterSuite method allowed");
        }


        if (!beforeSuiteMethods.isEmpty()) {
            beforeSuiteMethods.get(0).invoke(testInstance);
        }

        for (Method testMethod : testMethods) {
            testMethod.invoke(testInstance);
        }

        if (!afterSuiteMethods.isEmpty()) {
            afterSuiteMethods.get(0).invoke(testInstance);
        }
    }
}
