package CreationalPattern.AbstractFactoryPattern.Factory;

import CreationalPattern.AbstractFactoryPattern.Interfaces.Shape;

public abstract class AbstractShapeFactory {
    public abstract Shape getShape(String shapeType);
}
