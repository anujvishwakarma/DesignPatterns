package StructuralPattern.BridgePattern;

public class MainRunner {
    public static void main(String[] args) {
        Shape squareShape = new Square(new Blue());
        System.out.println(squareShape.draw());
    }
}
