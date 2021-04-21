package FactoryPattern.CarImplement;

import FactoryPattern.CarInterface.Car;

/**
 * @author ziv
 * @date 2021-04-21 8:12 下午
 * @description 繼承車的interface
 * 步驟2
 */
public class BMW implements Car {
    @Override
    public void run() {
        System.out.println("這是賓士車車的跑");
    }
}
