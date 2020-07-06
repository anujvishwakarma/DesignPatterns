package BuilderPattern;

public class MainRunner {

    public static void main(String[] args) {
        User user = new User.UserBuilder().setAge(20).setFirstName("Anuj").setLastName("Vishwakarma").build();
        System.out.println(user.getFirstName());
    }

}

