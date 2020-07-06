import StructuralPattern.FacadePattern.ShapeMaker;
import org.junit.Test;

public class FacadePatternTest {

    @Test
    public void TestFacadePattern(){
        ShapeMaker shapeMaker = new ShapeMaker();
        String message = shapeMaker.drawCircle();
        System.out.println(message.equals("Circle is Drawn"));
    }
}
