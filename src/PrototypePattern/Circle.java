package PrototypePattern;

/**
 * @author ziv
 * @date 2021-05-26 2:24 下午
 * @description
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
