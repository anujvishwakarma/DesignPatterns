import BuilderPattern.User;
import org.junit.Assert;
import org.junit.Test;

public class BuilderPatternTest {

    @Test
    public void createUserByBuilder(){
        User user = new User.UserBuilder().setFirstName("Anuj").setLastName("Vishwakarma").setAge(25).build();
        Assert.assertTrue(user.getFirstName().equals("Anuj"));
        Assert.assertNull(user.getCountry());
    }
}
