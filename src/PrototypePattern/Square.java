package PrototypePattern;

/**
 * @author ziv
 * @date 2021-05-26 2:23 下午
 * @description
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
