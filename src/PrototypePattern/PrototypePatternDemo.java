package PrototypePattern;

/**
 * @author ziv
 * @date 2021-05-26 3:01 下午
 * @description
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + cloneShape.getType());
        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + cloneShape2.getType());
        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + cloneShape3.getType());
    }
}
