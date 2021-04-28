package AbstractFactoryPattern.HeroFactory;

import AbstractFactoryPattern.HeroImplement.Batman;
import AbstractFactoryPattern.HeroImplement.Ironman;
import AbstractFactoryPattern.HeroImplement.Superman;
import AbstractFactoryPattern.HeroImplement.Thor;
import AbstractFactoryPattern.HeroInterface.Hero;
import AbstractFactoryPattern.HeroInterface.Race;

/**
 * @author ziv
 * @date 2021-04-28 8:34 上午
 * @description 建造一個英雄工廠
 */
public class HeroFactory extends AbstractFactory{
    public Hero getSkill(String heroName) {
        if ("".equals(heroName) || heroName == null) {
            return null;
        } else if ("batman".equalsIgnoreCase(heroName)) {
            return new Batman();
        } else if ("superman".equalsIgnoreCase(heroName)) {
            return new Superman();
        } else if ("thor".equalsIgnoreCase(heroName)) {
            return new Thor();
        } else if ("ironman".equalsIgnoreCase(heroName)) {
            return new Ironman();
        }
        return null;
    }

    @Override
    public Race getRace(String raceType) {
        return null;
    }
}
