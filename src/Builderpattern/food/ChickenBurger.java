package Builderpattern.food;

import Builderpattern.Afood.Burger;

/**
 * @author ziv
 * @date 2021-05-19 11:22 上午
 * @description
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "雞肉漢堡";
    }
}
