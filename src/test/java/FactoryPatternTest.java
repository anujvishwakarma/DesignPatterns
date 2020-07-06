import CreationalPattern.FactoryPattern.Rectangle;
import CreationalPattern.FactoryPattern.Shape;
import CreationalPattern.FactoryPattern.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class FactoryPatternTest {

    @Test
    public void createRectangleObject(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShapeObject("Rectangle");
        Assert.assertTrue(shape instanceof Rectangle);
    }
}
