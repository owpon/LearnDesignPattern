package Builderpattern.Adrink;

import Builderpattern.Bottle;
import Builderpattern.Item;
import Builderpattern.Packing;

/**
 * @author ziv
 * @date 2021-05-19 11:18 上午
 * @description 創造抽象的冷飲，並提供默認的class
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
 
    @Override
    public abstract float price();
}
