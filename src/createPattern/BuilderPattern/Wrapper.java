package createPattern.BuilderPattern;

import createPattern.BuilderPattern.Interface.Packing;

/**
 * Created by cp
 * data  2019/4/8.
 * description����װʵ���࣬������
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper";
    }
}
