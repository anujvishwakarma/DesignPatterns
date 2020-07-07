import BehaviouralPattern.Iterator.Iterator;
import BehaviouralPattern.Iterator.NameClass;
import org.junit.Assert;
import org.junit.Test;

public class IteratorPatternTest {

    @Test
    public void testIteratorPattern(){
        NameClass nameClass = new NameClass();
        Iterator it = nameClass.getIterator();
        int count =0 ;
        while(it.hasNext()){
            it.next();
            count++;
        }
        Assert.assertEquals(5, count);
    }
}
