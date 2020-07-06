import StructuralPattern.BridgePattern.Blue;
import StructuralPattern.BridgePattern.Shape;
import StructuralPattern.BridgePattern.Square;
import org.junit.Assert;
import org.junit.Test;

public class BridgePatternTest {

    @Test
    public void createBridgeWithShapeAndColor(){
        Shape shape = new Square(new Blue());
        Assert.assertTrue(shape.draw().equals("Square draw with Color is Blue"));
    }

}
