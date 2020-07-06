package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Interfaces.Shape;
import AbstractFactoryPattern.Model.Rectangle;
import AbstractFactoryPattern.Model.Square;

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
