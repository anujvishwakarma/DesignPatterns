package AbstractFactoryPattern.Model;

import AbstractFactoryPattern.Interfaces.Shape;

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle Drawn");
    }
}
