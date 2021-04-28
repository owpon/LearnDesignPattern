package AbstractFactoryPattern.HeroFactory;

import AbstractFactoryPattern.HeroImplement.Alien;
import AbstractFactoryPattern.HeroImplement.Human;
import AbstractFactoryPattern.HeroImplement.Protoss;
import AbstractFactoryPattern.HeroInterface.Hero;
import AbstractFactoryPattern.HeroInterface.Race;

/**
 * @author ziv
 * @date 2021-04-28 8:56 上午
 * @description 建造一個種族工廠
 */
public class RaceFactory extends AbstractFactory {
    public Race getRace(String raceType) {
        if ("".equals(raceType) || raceType == null) {
            return null;
        } else if ("alien".equalsIgnoreCase(raceType)) {
            return new Alien();
        } else if ("human".equalsIgnoreCase(raceType)) {
            return new Human();
        } else if ("protoss".equalsIgnoreCase(raceType)) {
            return new Protoss();
        }
        return null;
    }

    @Override
    public Hero getSkill(String skill) {
        return null;
    }
}
