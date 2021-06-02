package BridgePattern.Circle;

import BridgePattern.DrawApi;
import BridgePattern.Shape;

/**
 * @author ziv
 * @date 2021-06-02 2:02 下午
 * @description
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;

    }
    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
