package Builderpattern;

import Builderpattern.drink.Cock;
import Builderpattern.drink.Tea;
import Builderpattern.food.ChickenBurger;
import Builderpattern.food.VegBurger;

/**
 * @author ziv
 * @date 2021-05-19 11:48 上午
 * @description 創造一個品項builder，負責創建品項
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Cock());
        return meal;
    }

    public Meal prepareNoneVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Tea());
        return meal;
    }
}
