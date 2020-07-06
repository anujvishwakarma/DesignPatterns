package CreationalPattern.PrototypePattern;

import java.util.Hashtable;

public class ColorCache {

    private static Hashtable<String, AbstractColor> cache = new Hashtable<String, AbstractColor>();

    static {
        cache.put("Blue", new Blue());
        cache.put("Black", new Black());
    }

    public static AbstractColor getColor(String colorName){
        return (AbstractColor) cache.get(colorName).clone();
    }
}
