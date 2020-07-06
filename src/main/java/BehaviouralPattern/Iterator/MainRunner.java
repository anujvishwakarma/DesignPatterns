package BehaviouralPattern.Iterator;

public class MainRunner {

    public static void main(String[] args) {
        NameClass nameClass = new NameClass();
        Iterator a = nameClass.getIterator();
        while(a.hasNext()){
            System.out.println(a.next());
        }
    }
}
