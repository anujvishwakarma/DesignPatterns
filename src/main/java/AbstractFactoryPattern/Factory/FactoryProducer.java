package AbstractFactoryPattern.Factory;

public class FactoryProducer {
    public static AbstractShapeFactory getFactory(boolean isRounded){
        if(isRounded){
            return new RoundShapeFactory();
        }
        return new EdgeShapeFactory();
    }
}
