package createPattern.BuilderPattern.Implements;

import createPattern.BuilderPattern.Burger;

/**
 * Created by cp
 * data  2019/4/8.
 * description: ������չ�ࣻ�߲˺���
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Vegetable Burger";
    }
}
