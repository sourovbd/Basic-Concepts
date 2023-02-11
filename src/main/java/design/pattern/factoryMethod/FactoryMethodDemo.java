package design.pattern.factoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        FactoryMethod rectangleFactoryMethod = new RectangleFactoryMethod();
        //rectangleFactoryMethod.createShape();
        rectangleFactoryMethod.drawShape("This is a rectangle drawing message.");

        FactoryMethod circleFactoryMethod = new CircleFactoryMethod();
        //circleFactoryMethod.createShape();
        circleFactoryMethod.drawShape("This is a circle drawing message.");
    }
}
