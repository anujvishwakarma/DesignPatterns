import CreationalPattern.PrototypePattern.AbstractColor;
import CreationalPattern.PrototypePattern.Blue;
import CreationalPattern.PrototypePattern.ColorCache;
import org.junit.Assert;
import org.junit.Test;

public class PrototypePatternTest {

    @Test
    public void createPrototypeObject(){
        AbstractColor abstractColor = ColorCache.getColor("Blue");
        Assert.assertTrue(abstractColor instanceof Blue);
    }
}
