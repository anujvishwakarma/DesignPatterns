package FactoryPattern;

public class ShapeFactory {

    public Shape getShapeObject(String shapeName){
        if(shapeName.equals("Rectangle")){
            return new Rectangle();
        }
        else if(shapeName.equals("Circle")){
            return new Circle();
        }
        return null;
    }
}
