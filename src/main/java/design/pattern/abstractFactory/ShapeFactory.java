package design.pattern.abstractFactory;



public class ShapeFactory extends AbstractFactory{
    public Shape createShape(String shapeType) {
        switch (shapeType) {
            case "Circle" :
                return new Circle();
            case "Rectangle" :
                return new Rectangle();
            default:
                return null;
        }
    }
}
