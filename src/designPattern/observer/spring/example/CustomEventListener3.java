package designPattern.observer.spring.example;

import org.springframework.context.ApplicationListener;

public class CustomEventListener3 implements ApplicationListener<CustomEvent2> {
    @Override
    public void onApplicationEvent(CustomEvent2 event) {
        System.out.println("Received custom event 3: " + event.getSource());
    }
}
