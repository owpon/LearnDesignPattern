package SingletonPattern.HungerMode;

/**
 * @author ziv
 * @date 2021-05-05 9:51 上午
 * @description 只有建構一次，感覺是可以用在db連線的部分
 */
public class SingleObject {
    //建立一個Singleobject 對象
    private static SingleObject instance = new SingleObject();

    //讓建構函數為private，就不會被實例化
    private SingleObject() {
    }

    //獲取唯一可用的對象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
