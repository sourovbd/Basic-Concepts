package object.oriented.polymorphism.runtime;

public class Main {
    public static void main(String[] args) {
        //Injecting dependency into DrawObject()
        DrawObject(new Circle());
        DrawObject(new Square());
        DrawObject(new Triangle());

        Shape shape;
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();
        shape = new Triangle();
        shape.draw();
    }
    public static void DrawObject(Shape shape) {
         shape.draw();
    }
}
