package CreationalPattern.AbstractFactoryPattern.Model;

import CreationalPattern.AbstractFactoryPattern.Interfaces.Shape;

public class Circle implements Shape {
    public void draw() {
        System.out.println("Circle Drawn");
    }
}
