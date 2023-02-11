package designPattern.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
        Shape circleShape = abstractFactory.createShape("Circle");
        circleShape.draw();
        Shape rectangleShape = abstractFactory.createShape("Rectangle");
        rectangleShape.draw();
    }
}
