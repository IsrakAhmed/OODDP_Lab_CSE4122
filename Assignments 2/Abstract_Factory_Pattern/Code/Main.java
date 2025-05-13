public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        shape2.draw();
    }
}
