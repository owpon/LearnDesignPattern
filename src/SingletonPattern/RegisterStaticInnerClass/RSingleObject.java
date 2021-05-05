package SingletonPattern.RegisterStaticInnerClass;

/**
 * @author ziv
 * @date 2021-05-05 11:28 上午
 * @description 登記式/靜態內部類別
 */
public class RSingleObject {
    private static class RSingleObjectHolder {
        private static final RSingleObject instance = new RSingleObject();
    }

    private RSingleObject() {
    }

    public static final RSingleObject getInstance() {
        return RSingleObjectHolder.instance;
    }
}
