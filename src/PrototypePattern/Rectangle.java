package PrototypePattern;

/**
 * @author ziv
 * @date 2021-05-26 2:21 下午
 * @description
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
