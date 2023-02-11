package designPattern.factoryMethod;

public class RectangleFactoryMethod extends FactoryMethod {
    @Override
    Shape createShape() {
        return new Rectangle();
    }
}
