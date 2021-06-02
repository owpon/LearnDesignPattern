package BridgePattern.Circle;

import BridgePattern.DrawApi;

/**
 * @author ziv
 * @date 2021-06-02 1:54 下午
 * @description 實作DrawApi的方法
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
