package designPattern.factoryMethod;

public class Circle implements Shape {

    Circle() {
        System.out.println("Circle is created.");
    }
    @Override
    public void draw(String message) {
        System.out.println("Circle: "+message);
    }
}
