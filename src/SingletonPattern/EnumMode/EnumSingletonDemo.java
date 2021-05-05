package SingletonPattern.EnumMode;

/**
 * @author ziv
 * @date 2021-05-05 11:51 上午
 * @description
 */
public class EnumSingletonDemo {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.showMessage();
    }
}
