package createPattern.BuilderPattern.Implements;

import createPattern.BuilderPattern.ColdDrink;

/**
 * Created by cp
 * data  2019/4/8.
 * description: ���ϵ�ʵ���ࣺpepsi
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 15.0f;

    }

    @Override
    public String name() {
        return "pepsi";
    }
}
