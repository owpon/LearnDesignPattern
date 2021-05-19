package Builderpattern.food;

import Builderpattern.Afood.Burger;

/**
 * @author ziv
 * @date 2021-05-19 11:21 上午
 * @description 創建擴展burger類的實體
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "蔬菜漢堡";
    }
}
