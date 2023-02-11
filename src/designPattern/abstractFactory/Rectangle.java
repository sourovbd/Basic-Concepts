package designPattern.abstractFactory;

import designPattern.abstractFactory.Shape;

public class Rectangle implements Shape {
    public Rectangle() {
        System.out.println("Rectangle is created.");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}
