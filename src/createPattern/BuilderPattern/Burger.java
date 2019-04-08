package createPattern.BuilderPattern;

import createPattern.BuilderPattern.Interface.Item;
import createPattern.BuilderPattern.Interface.Packing;

/**
 * Created by cp
 * data  2019/4/8.
 * description£∫∫∫±§ µœ÷¿‡
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract  float price();
}
