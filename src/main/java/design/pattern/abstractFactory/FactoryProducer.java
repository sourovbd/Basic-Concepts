package design.pattern.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
