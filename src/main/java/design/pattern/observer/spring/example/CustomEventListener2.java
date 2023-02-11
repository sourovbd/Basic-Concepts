package design.pattern.observer.spring.example;

import org.springframework.context.ApplicationListener;

public class CustomEventListener2 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Received custom event 2: " + event.getSource());
    }
}
