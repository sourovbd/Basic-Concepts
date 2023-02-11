package design.pattern.observer.spring.example;

import org.springframework.context.ApplicationEvent;

public class CustomEvent2 extends ApplicationEvent {
    public CustomEvent2(Object source) {
        super(source);
    }
}
