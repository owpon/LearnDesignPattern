package SingletonPattern.DoubleCheckLock;

/**
 * @author ziv
 * @date 2021-05-05 11:15 上午
 * @description
 */
public class DCLSingleObjectDemo {
    public static void main(String[] args) {
        DCLSingleObject dclSingleObject = DCLSingleObject.getInstance();
        dclSingleObject.showMessage();
    }
}
