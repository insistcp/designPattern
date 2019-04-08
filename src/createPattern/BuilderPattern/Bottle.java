package createPattern.BuilderPattern;

import createPattern.BuilderPattern.Interface.Packing;

/**
 * Created by cp
 * data  2019/4/8.
 * description: 包装实现类：瓶子类
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
