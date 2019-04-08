package createPattern.BuilderPattern;

/**
 * Created by cp
 * data  2019/4/8.
 * description: Build Pattern 建造者模式：为复杂对象的创建而服务。
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost：" + vegMeal.getCost());
    }
}
