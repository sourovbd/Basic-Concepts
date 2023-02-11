package object.oriented.interfaceTest;

public class EmailServiceImpl implements EmailService{

    private void connect() {
        System.out.println("Configuration for connecting...");
    }

    private void disconnect() {
        System.out.println("Configuration for disconnecting...");
    }

    @Override
    public void sendEmail() {
        this.connect();
        System.out.println("Sending mail ...");
        this.disconnect();
    }
}
