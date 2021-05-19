package Builderpattern.drink;

import Builderpattern.Adrink.ColdDrink;

/**
 * @author ziv
 * @date 2021-05-19 11:23 上午
 * @description
 */
public class Cock extends ColdDrink {
    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "可樂";
    }
}
