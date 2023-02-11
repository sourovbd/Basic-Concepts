package design.pattern.factory;

public class Circle implements Shape{
    public Circle() {
        System.out.println("Circle is created.");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}
