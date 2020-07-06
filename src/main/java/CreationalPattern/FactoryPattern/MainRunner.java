package CreationalPattern.FactoryPattern;

public class MainRunner {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape currentShape = shapeFactory.getShapeObject("Rectangle");
        currentShape.drawShape();
    }
}
