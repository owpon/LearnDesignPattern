package SingletonPattern.LazyMode;

/**
 * @author ziv
 * @date 2021-05-05 10:35 上午
 * @description
 */
public class ThreadSafeSingleObjectDemo {
    public static void main(String[] args) {
        ThreadSafeSingleObject threadSafeSingleObject = ThreadSafeSingleObject.getInstance();
        threadSafeSingleObject.showMessage();
    }
}
