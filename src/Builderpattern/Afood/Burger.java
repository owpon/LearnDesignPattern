package Builderpattern.Afood;

import Builderpattern.Item;
import Builderpattern.Packing;
import Builderpattern.Wrapper;

/**
 * @author ziv
 * @date 2021-05-19 11:15 上午
 * @description 創造實現品項的抽象介面，提供包裝跟抽象的價格
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
