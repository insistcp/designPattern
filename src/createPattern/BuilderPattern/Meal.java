package createPattern.BuilderPattern;

import createPattern.BuilderPattern.Interface.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cp
 * data  2019/4/8.
 * description: 套餐类：组装各类食物
 */
public class Meal {
    private List<Item> itemList = new ArrayList<>();
    public void addItem(Item item) {
        itemList.add(item);
    }
    public float getCost() {
        float totalCost = 0;
        for (Item item : itemList) {
            totalCost += item.price();
        }
        return totalCost;
    }
    public void showItems() {
        for (Item item : itemList) {
            System.out.println(item.name()+"---"+item.packing().pack()+"----"+item.price());
        }
    }
}
