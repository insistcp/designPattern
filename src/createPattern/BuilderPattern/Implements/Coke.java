package createPattern.BuilderPattern.Implements;

import createPattern.BuilderPattern.ColdDrink;

/**
 * Created by cp
 * data  2019/4/8.
 * description: ���ϵ�ʵ���ࣺcoke
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 10.0f;

    }

    @Override
    public String name() {
        return "coke";
    }
}
