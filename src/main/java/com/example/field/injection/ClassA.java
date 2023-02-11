package main.java.com.example.field.injection;

import com.example.ClassB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** Example of constructor injection*/
@Component("classA2")
public class ClassA {

    @Autowired
    private ClassB classB;

    public void doSomething() {
        System.out.println("Doing something in ClassA");
        classB.doSomething();
    }
}
