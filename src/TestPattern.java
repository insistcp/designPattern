import createPattern.AbstractFactory.AbstractFactory;
import createPattern.AbstractFactory.Color;
import createPattern.AbstractFactory.FactoryProducer;
import createPattern.factory.Fruit;
import createPattern.factory.FruitFactory;


public class TestPattern {
    public static void main(String[] args) {
//        FruitFactory factory = new FruitFactory();
//        Fruit fruit =  factory.createFruit("apple");
//        fruit.sayName();

        AbstractFactory factory = FactoryProducer.getFactory("color");
       Color red =  factory.getColor("red");
        red.sayColor();
    }
}
