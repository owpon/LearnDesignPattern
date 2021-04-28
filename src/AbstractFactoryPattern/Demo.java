package AbstractFactoryPattern;

import AbstractFactoryPattern.HeroFactory.AbstractFactory;
import AbstractFactoryPattern.HeroFactory.FactorProducer;
import AbstractFactoryPattern.HeroInterface.Hero;
import AbstractFactoryPattern.HeroInterface.Race;

/**
 * @author ziv
 * @date 2021-04-28 8:43 上午
 * @description 通過呼叫工廠的生產者去實作各個
 */
public class Demo {
    public static void main(String[] args) {
        //透過調用工廠生產者來產生實體的工廠們
        AbstractFactory heroFactory = FactorProducer.getFactory("hero");
        Hero batman = heroFactory.getSkill("batman");
        batman.skill();
        Hero superman = heroFactory.getSkill("superman");
        superman.skill();
        Hero thor = heroFactory.getSkill("thor");
        thor.skill();
        Hero ironman = heroFactory.getSkill("ironman");
        ironman.skill();
        AbstractFactory RaceFactory = FactorProducer.getFactory("race");
        Race batmanRace = RaceFactory.getRace("human");
        batmanRace.isManKind();
        Race supermanRace = RaceFactory.getRace("alien");
        supermanRace.isManKind();
        Race thorRace = RaceFactory.getRace("protoss");
        thorRace.isManKind();
        Race ironmanRace = RaceFactory.getRace("human");
        ironmanRace.isManKind();
    }
}
