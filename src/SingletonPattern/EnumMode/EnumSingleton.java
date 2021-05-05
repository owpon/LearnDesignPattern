package SingletonPattern.EnumMode;

/**
 * @author ziv
 * @date 2021-05-05 11:49 上午
 * @description 使用enum方法可以更簡潔，自動支持序列化機制，絕對防止多次實例化
 */
public enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("this is enum singleton mode.");
    }

}
