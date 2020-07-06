package CreationalPattern.SingletonPattern;

public class MainRunner {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.getMessage();
    }
}
