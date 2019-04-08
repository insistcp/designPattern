package createPattern.BuilderPattern;

import createPattern.BuilderPattern.Implements.ChickenBurger;
import createPattern.BuilderPattern.Implements.Coke;
import createPattern.BuilderPattern.Implements.Pepsi;
import createPattern.BuilderPattern.Implements.VegBurger;

/**
 * Created by cp
 * data  2019/4/8.
 * description: Ì×²Í´´½¨Àà
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
