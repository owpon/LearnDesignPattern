package AbstractFactoryPattern.HeroImplement;

import AbstractFactoryPattern.HeroInterface.Hero;

/**
 * @author ziv
 * @date 2021-04-28 8:38 上午
 * @description
 */
public class Thor implements Hero {
    @Override
    public void skill() {
        System.out.println("我有一把酷炫的錘子，只是被老姐捏碎");
    }
}
