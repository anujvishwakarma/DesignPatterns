package CreationalPattern.AbstractFactoryPattern.Factory;

import CreationalPattern.AbstractFactoryPattern.Interfaces.Shape;
import CreationalPattern.AbstractFactoryPattern.Model.Rectangle;
import CreationalPattern.AbstractFactoryPattern.Model.Square;

public class EdgeShapeFactory extends AbstractShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType.equals("Square")){
            return new Square();
        }
        else if(shapeType.equals("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
