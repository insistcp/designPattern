package createPattern.BuilderPattern;

import createPattern.BuilderPattern.Interface.Item;
import createPattern.BuilderPattern.Interface.Packing;

/**
 * Created by cp
 * data  2019/4/8.
 * description: ����ʵ����
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract  float price();
}
