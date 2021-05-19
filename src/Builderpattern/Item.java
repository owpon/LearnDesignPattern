package Builderpattern;

/**
 * @author ziv
 * @date 2021-05-19 11:07 上午
 * @description 創造食物的品項的interface
 */
public interface Item {
    String name();

    Packing packing();

    float price();

}
