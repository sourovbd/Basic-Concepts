package design.pattern.factoryMethod;

abstract public class FactoryMethod {

    public void drawShape(String message) {
        Shape shape = createShape();
        shape.draw(message);
    }
    abstract Shape createShape();
}
