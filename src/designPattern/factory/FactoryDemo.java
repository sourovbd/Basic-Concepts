package designPattern.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("Circle");
        circle.draw();
        Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.draw();

    }
}
