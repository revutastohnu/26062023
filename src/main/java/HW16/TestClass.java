package HW16;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TestClass {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Test {
        int priority() default 5;
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface BeforeSuite {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface AfterSuite {
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite method");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test method 1");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test method 2");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite method");
    }

}
