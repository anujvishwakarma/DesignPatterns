package AbstractFactoryPattern.Model;

import AbstractFactoryPattern.Interfaces.Shape;

public class Square implements Shape {
    public void draw() {
        System.out.println("Square Drawn");
    }
}
