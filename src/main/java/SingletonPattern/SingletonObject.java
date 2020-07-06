package SingletonPattern;

public class SingletonObject {
    public static SingletonObject singletonObject = new SingletonObject();

    private SingletonObject() { }

    public static SingletonObject getInstance(){
        return singletonObject;
    }

    public void getMessage(){
        System.out.println("In Singleton Object");
    }
}
