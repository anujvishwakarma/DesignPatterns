package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Interfaces.Shape;

public abstract class AbstractShapeFactory {
    public abstract Shape getShape(String shapeType);
}
