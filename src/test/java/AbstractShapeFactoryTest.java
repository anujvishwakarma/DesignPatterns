import AbstractFactoryPattern.Factory.AbstractShapeFactory;
import AbstractFactoryPattern.Factory.FactoryProducer;
import AbstractFactoryPattern.Factory.RoundShapeFactory;
import AbstractFactoryPattern.Model.Circle;
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
