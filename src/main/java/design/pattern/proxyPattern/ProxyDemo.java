package design.pattern.proxyPattern;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ImageProxy("test_10mb.jpg");
        image.display();
        System.out.println("\n...Displaying proxy image...");
        image.display();
        image.display();
        image.display();
    }
}
