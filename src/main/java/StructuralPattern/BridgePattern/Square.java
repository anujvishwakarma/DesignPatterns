package StructuralPattern.BridgePattern;

public class Square extends Shape{


    public Square(Color color) {
        super(color);
    }

    public String draw() {
        return "Square draw with "+ color.fill();
    }

}
