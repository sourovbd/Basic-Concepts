package design.pattern.factory.spring.example;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{
    @Override
    public String getMessage() {
        return "Email Message.";
    }
}
