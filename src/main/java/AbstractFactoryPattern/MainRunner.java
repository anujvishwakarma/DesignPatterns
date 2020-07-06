package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.AbstractShapeFactory;
import AbstractFactoryPattern.Factory.FactoryProducer;
import AbstractFactoryPattern.Interfaces.Shape;

public class MainRunner {
    public static void main(String[] args) {
        AbstractShapeFactory factories = FactoryProducer.getFactory(true);
        Shape shape =  factories.getShape("Circle");
        shape.draw();
    }
}
