package createPattern.factory;

import createPattern.factory.Apple;
import createPattern.factory.Banana;
import createPattern.factory.Fruit;

public class FruitFactory {
    public Fruit createFruit(String name) {
        if (name.equals("apple")) {
            return new Apple("apple");
        } else if (name.equals("banana")) {
            return new Banana("banana");
        } else {
            return null;
        }
    }
}
