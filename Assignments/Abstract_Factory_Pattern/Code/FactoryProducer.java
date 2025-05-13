public class FactoryProducer {
    public static AbstractFactory getFactory(Boolean rounded){
        if(rounded){
            return new RoundShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
