import SingletonPattern.SingletonObject;
import org.junit.Assert;
import org.junit.Test;

public class SingletonObjectTest {

    @Test
    public void createSingleObject(){
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();
        Assert.assertTrue(singletonObject1 == singletonObject2);
    }

}
