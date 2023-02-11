package designPattern.observer.spring.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.addApplicationListener(new CustomEventListener());
        context.addApplicationListener(new CustomEventListener2());
        context.addApplicationListener(new CustomEventListener3());
        context.refresh();
        context.publishEvent(new CustomEvent2("Hello World!"));
        context.publishEvent(new CustomEvent2("Hi World!"));
        context.close(); //This is observer
    }
}
