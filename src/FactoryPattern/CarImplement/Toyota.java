package FactoryPattern.CarImplement;

import FactoryPattern.CarInterface.Car;

/**
 * @author ziv
 * @date 2021-04-21 8:09 下午
 * @description 繼承車的interface
 * 步驟2
 */
public class Toyota implements Car {

    @Override
    public void run() {
        System.out.println("這是頭又大的車車開始跑起來");
    }
}
