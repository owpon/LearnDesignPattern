package FactoryPattern;

import FactoryPattern.CarFactory.CarFactory;
import FactoryPattern.CarInterface.Car;

/**
 * @author ziv
 * @date 2021-04-21 8:23 下午
 * @description 依靠工廠產生車輛
 */
public class Demo {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.getCar("bmw");
        bmw.run();
        Car benz = carFactory.getCar("benz");
        benz.run();
        Car toyota = carFactory.getCar("toyota");
        toyota.run();
        Car tesla = carFactory.getCar("tesla");
        tesla.run();
    }
}
