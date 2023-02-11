package com.example.field.injection;
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

        /** In case of field injection*/
        ClassA classA = new ClassA();

        context.getAutowireCapableBeanFactory().autowireBean(classA);

        classA.doSomething();

        context.close();
    }
}
