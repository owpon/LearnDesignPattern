package SingletonPattern.LazyMode;

/**
 * @author ziv
 * @date 2021-05-05 10:11 上午
 * @description 屬於unthread safe模式，再多執行緒的時候會出事，因為沒有加上synchronized
 */
public class UnthreadSafeSingleObject {
    private static UnthreadSafeSingleObject unthreadSafeSingleObject;

    //讓這個class不被實體化（即避免被人拿來new）
    private UnthreadSafeSingleObject() {
    }

    public static UnthreadSafeSingleObject getInstance() {
        if (unthreadSafeSingleObject == null) {
            unthreadSafeSingleObject = new UnthreadSafeSingleObject();
        }
        return unthreadSafeSingleObject;
    }

    public void showMessage() {
        System.out.println("this is unthread safe mode.");
    }

}
