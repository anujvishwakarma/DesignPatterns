package CreationalPattern.AbstractFactoryPattern.Factory;

import CreationalPattern.AbstractFactoryPattern.Model.Circle;
import CreationalPattern.AbstractFactoryPattern.Model.Eclipse;
import CreationalPattern.AbstractFactoryPattern.Interfaces.Shape;

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
