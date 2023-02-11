package com.example.constructor.injection;

import com.example.ClassB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.example");
        context.refresh();

        /** In case of constructor injection*/
        ClassB classB = new ClassB();
        ClassA classA = new ClassA(classB);

        context.getAutowireCapableBeanFactory().autowireBean(classA);

        classA.doSomething();

        context.close();
    }
}
