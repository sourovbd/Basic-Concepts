package designPattern.factory.spring.example;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceFactory {
    public MessageService getMessageService(String serviceType) {
        if (serviceType.equalsIgnoreCase("email")) {
            return new EmailService();
        } else if (serviceType.equalsIgnoreCase("sms")) {
             return new SMSService();
        }
        return null;
    }
}
