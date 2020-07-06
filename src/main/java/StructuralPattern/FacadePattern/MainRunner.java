package StructuralPattern.FacadePattern;

public class MainRunner {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        String message = shapeMaker.drawCircle();
        System.out.println(message);
    }
}
