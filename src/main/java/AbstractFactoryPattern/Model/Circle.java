package AbstractFactoryPattern.Model;

import AbstractFactoryPattern.Interfaces.Shape;

public class Circle implements Shape {
    public void draw() {
        System.out.println("Circle Drawn");
    }
}
