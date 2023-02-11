package design.pattern.factory.spring.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("designPattern.factory.springframework");
        applicationContext.refresh();

        MessageServiceFactory messageServiceFactory = applicationContext.getBean(MessageServiceFactory.class);

        MessageService emailService = messageServiceFactory.getMessageService("email");
        String emailMessage = emailService.getMessage();
        System.out.println("message: "+emailMessage);

        MessageService smsService = messageServiceFactory.getMessageService("sms");
        String smsMessage = smsService.getMessage();
        System.out.println("message: "+smsMessage);
    }
}

