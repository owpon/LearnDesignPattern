package AbstractFactoryPattern.HeroImplement;

import AbstractFactoryPattern.HeroInterface.Hero;

/**
 * @author ziv
 * @date 2021-04-28 8:38 上午
 * @description
 */
public class Superman implements Hero {
    @Override
    public void skill() {
        System.out.println("具有超強力量及速度");
    }
}
