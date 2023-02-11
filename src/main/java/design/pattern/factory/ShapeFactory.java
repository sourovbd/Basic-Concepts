package design.pattern.factory;

public class ShapeFactory {
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
