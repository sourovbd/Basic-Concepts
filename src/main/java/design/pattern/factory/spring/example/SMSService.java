package design.pattern.factory.spring.example;

import org.springframework.stereotype.Service;

@Service
public class SMSService implements MessageService {
    @Override
    public String getMessage() {
        return "SMS Message";
    }
}
