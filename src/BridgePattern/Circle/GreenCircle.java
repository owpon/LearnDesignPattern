package BridgePattern.Circle;

import BridgePattern.DrawApi;

/**
 * @author ziv
 * @date 2021-06-02 1:55 下午
 * @description 實作DrawApi的方法
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }

}
