package designPattern.factoryMethod;

public class Rectangle implements Shape {
    Rectangle() {
        System.out.println("Rectangle is created.");
    }
    @Override
    public void draw(String message) {
        System.out.println("Rectangle: "+message);
    }
}
