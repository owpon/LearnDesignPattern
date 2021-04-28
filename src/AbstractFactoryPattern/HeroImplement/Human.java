package AbstractFactoryPattern.HeroImplement;

import AbstractFactoryPattern.HeroInterface.Race;

/**
 * @author ziv
 * @date 2021-04-28 8:54 上午
 * @description 人類
 */
public class Human implements Race {
    @Override
    public void isManKind() {
        System.out.println("我是人類");
    }
}
