package StructuralPattern.FacadePattern;

public class ShapeMaker {

    private final Shape circle;

    private final Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public String drawCircle(){
        return circle.draw();
    }

    public String drawRectangle(){
        return rectangle.draw();
    }

}
