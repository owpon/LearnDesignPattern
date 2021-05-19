package Builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ziv
 * @date 2021-05-19 11:42 上午
 * @description 創建套餐的品項
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("品項:" + item.name());
            System.out.print(",包裝:" + item.packing().pack());
            System.out.println(",價格" + item.price());
        }
    }
}
