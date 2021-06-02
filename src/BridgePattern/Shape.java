package BridgePattern;

/**
 * @author ziv
 * @date 2021-06-02 1:57 下午
 * @description 使用DrawApi接口創建抽象類別Shape
 */
public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
