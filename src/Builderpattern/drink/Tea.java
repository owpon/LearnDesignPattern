package Builderpattern.drink;

import Builderpattern.Adrink.ColdDrink;

/**
 * @author ziv
 * @date 2021-05-19 11:24 上午
 * @description
 */
public class Tea extends ColdDrink {
    @Override
    public float price() {
        return 12.0f;
    }

    @Override
    public String name() {
        return "茶";
    }
}
