package FactoryPattern.CarFactory;

import FactoryPattern.CarImplement.BMW;
import FactoryPattern.CarImplement.Benz;
import FactoryPattern.CarImplement.Tesla;
import FactoryPattern.CarImplement.Toyota;
import FactoryPattern.CarInterface.Car;

/**
 * @author ziv
 * @date 2021-04-21 8:18 下午
 * @description 建立一個車子的工廠
 * 步驟3
 */
public class CarFactory {
    public Car getCar(String carType) {
        if ("".equals(carType) || carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("BENZ")) {
            return new Benz();
        } else if (carType.equalsIgnoreCase("TESLA")) {
            return new Tesla();
        } else if (carType.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (carType.equalsIgnoreCase("Toyota")) {
            return new Toyota();
        }
        return null;
    }
}
