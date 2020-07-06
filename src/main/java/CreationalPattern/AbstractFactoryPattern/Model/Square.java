package CreationalPattern.AbstractFactoryPattern.Model;

import CreationalPattern.AbstractFactoryPattern.Interfaces.Shape;

public class Square implements Shape {
    public void draw() {
        System.out.println("Square Drawn");
    }
}
