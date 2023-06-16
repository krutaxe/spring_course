package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Test {
    @MethodInfo(purpose = "print Hello World")
    public  void printHelloWorld() {
        System.out.println("Hello World");
    }
}
