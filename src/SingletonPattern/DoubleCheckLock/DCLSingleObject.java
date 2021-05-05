package SingletonPattern.DoubleCheckLock;

/**
 * @author ziv
 * @date 2021-05-05 11:05 上午
 * @description 雙鎖機制，安全且多執行緒的情況下能保持高性能
 */
public class DCLSingleObject {
    private static DCLSingleObject dclSingleObject;

    private DCLSingleObject() {
    }

    public static DCLSingleObject getInstance() {
        if (dclSingleObject == null) {
            synchronized (DCLSingleObject.class) {
                if (dclSingleObject == null) {
                    dclSingleObject = new DCLSingleObject();
                }
            }
        }
        return dclSingleObject;
    }

    public void showMessage() {
        System.out.println("this is DCL safe mode.");
    }
}
