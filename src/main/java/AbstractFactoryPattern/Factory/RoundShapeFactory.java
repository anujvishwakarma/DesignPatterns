package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Model.Circle;
import AbstractFactoryPattern.Model.Eclipse;
import AbstractFactoryPattern.Interfaces.Shape;

public class RoundShapeFactory extends AbstractShapeFactory {

    public Shape getShape(String shapeType) {
        if(shapeType.equals("Circle")){
            return new Circle();
        }
        else if(shapeType.equals("Eclipse")){
            return new Eclipse();
        }
        return null;
    }
}
