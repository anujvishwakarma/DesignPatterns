package CreationalPattern.ThreadSafeSingletonPattern;

public class ThreadSafeSingletonObject {

    public static ThreadSafeSingletonObject threadSafeSingletonObject;

    private ThreadSafeSingletonObject() { }

    public static ThreadSafeSingletonObject getInstance(){
        if(threadSafeSingletonObject == null){
            synchronized (ThreadSafeSingletonObject.class){
                if(threadSafeSingletonObject == null){
                    threadSafeSingletonObject = new ThreadSafeSingletonObject();
                }
            }
        }
        return threadSafeSingletonObject;
    }

    public void getMessage(){
        System.out.println("In thread safe singletonObject");
    }
}
