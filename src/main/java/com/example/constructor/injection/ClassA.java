package com.example.constructor.injection;

import com.example.ClassB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** Example of constructor injection*/
@Component("classA1")
public class ClassA {

    private ClassB classB;

    /** Example of constructor injection*/
    @Autowired
    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    public void doSomething() {
        System.out.println("Doing something in ClassA");
        classB.doSomething();
    }
}
