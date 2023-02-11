package designPattern.factoryMethod;

public class CircleFactoryMethod extends FactoryMethod {

    @Override
    Shape createShape() {
        return new Circle();
    }
}
