package SingletonPattern.HungerMode;

/**
 * @author ziv
 * @date 2021-05-05 9:57 上午
 * @description
 */
public class SinglePatternDemo {
    public static void main(String[] args) {
        //不能直接new一個singleobject出來，確保只有一個instance
//        SingleObject singleObject1 = new SingleObject();
        //獲取一個唯一可用的對象
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
