package BehaviouralPattern.Iterator;

public class NameClass implements Container{
    String names [] = {"Anuj1","Anuj2","Anuj3","Anuj4","Anuj5"};

    @Override
    public Iterator getIterator() {
        return new NameIteratorClass();
    }

    private class NameIteratorClass implements Iterator {

        int index;

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }
    }
}
