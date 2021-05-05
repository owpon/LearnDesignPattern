package SingletonPattern.LazyMode;

/**
 * @author ziv
 * @date 2021-05-05 10:17 上午
 * @description
 */
public class UnthreadSafeSingleObjectDemo {
    public static void main(String[] args) {
        UnthreadSafeSingleObject unthreadSafeSingleObject = UnthreadSafeSingleObject.getInstance();
        unthreadSafeSingleObject.showMessage();
    }
}
