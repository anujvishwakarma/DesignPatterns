package CreationalPattern.AbstractFactoryPattern;

import CreationalPattern.AbstractFactoryPattern.Factory.AbstractShapeFactory;
import CreationalPattern.AbstractFactoryPattern.Factory.FactoryProducer;
import CreationalPattern.AbstractFactoryPattern.Interfaces.Shape;

public class MainRunner {
    public static void main(String[] args) {
        AbstractShapeFactory factories = FactoryProducer.getFactory(true);
        Shape shape =  factories.getShape("Circle");
        shape.draw();
    }
}
