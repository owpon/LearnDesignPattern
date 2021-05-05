package SingletonPattern.LazyMode;

/**
 * @author ziv
 * @date 2021-05-05 10:19 上午
 * @description 有良好的lazy loading，但是效能不佳，因為大多數的情況不需要同步
 */
public class ThreadSafeSingleObject {
    private static ThreadSafeSingleObject threadSafeSingleObject;

    private ThreadSafeSingleObject() {
    }

    //必須加上synchronized 才能確保同步，但是加上同步鎖會影響效率
    //影響效率的原因參照：https://www.mdeditor.tw/pl/g2QV/zh-tw
    public static synchronized ThreadSafeSingleObject getInstance() {
        if (threadSafeSingleObject == null) {
            threadSafeSingleObject = new ThreadSafeSingleObject();
        }
        return threadSafeSingleObject;
    }

    public void showMessage() {
        System.out.println("this is thread safe mode.");
    }


}
