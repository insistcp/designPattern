package createPattern.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String name) {
        if (name.equals("shape")) {
            return new ShapeFactory();
        } else if (name.equals("color")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
