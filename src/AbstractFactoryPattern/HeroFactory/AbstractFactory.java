package AbstractFactoryPattern.HeroFactory;

import AbstractFactoryPattern.HeroInterface.Hero;
import AbstractFactoryPattern.HeroInterface.Race;

/**
 * @author ziv
 * @date 2021-04-28 8:59 上午
 * @description 幫兩個工廠造一個抽象工廠，然後讓工廠們去繼承
 */
public abstract class AbstractFactory {
    public abstract Hero getSkill(String skill);

    public abstract Race getRace(String raceType);
}
