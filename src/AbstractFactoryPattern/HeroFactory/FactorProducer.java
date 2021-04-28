package AbstractFactoryPattern.HeroFactory;

/**
 * @author ziv
 * @date 2021-04-28 9:05 上午
 * @description 用工廠生產者，來進行分類，看是要量產hero還是race
 */
public class FactorProducer {
    public static AbstractFactory getFactory(String choice) {
        if ("hero".equalsIgnoreCase(choice)) {
            return new HeroFactory();
        } else if ("race".equalsIgnoreCase(choice)) {
            return new RaceFactory();
        }
        return null;
    }
}
