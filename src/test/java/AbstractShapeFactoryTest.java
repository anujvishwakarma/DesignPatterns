import CreationalPattern.AbstractFactoryPattern.Factory.AbstractShapeFactory;
import CreationalPattern.AbstractFactoryPattern.Factory.FactoryProducer;
import CreationalPattern.AbstractFactoryPattern.Factory.RoundShapeFactory;
import CreationalPattern.AbstractFactoryPattern.Model.Circle;
import org.junit.Assert;
import org.junit.Test;

public class AbstractShapeFactoryTest {

    @Test
    public void testAbstractShapeFactory(){
        AbstractShapeFactory abstractShapeFactory = FactoryProducer.getFactory(true);
        Assert.assertTrue(abstractShapeFactory instanceof RoundShapeFactory);
        Assert.assertTrue(abstractShapeFactory.getShape("Circle") instanceof Circle);
    }
}
