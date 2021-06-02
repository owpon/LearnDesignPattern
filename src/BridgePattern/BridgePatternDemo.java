package BridgePattern;

import BridgePattern.Circle.Circle;
import BridgePattern.Circle.GreenCircle;
import BridgePattern.Circle.RedCircle;

/**
 * @author ziv
 * @date 2021-06-02 2:05 下午
 * @description
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 10, 100, new RedCircle());
        Shape greenCircle = new Circle(5, 5, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
