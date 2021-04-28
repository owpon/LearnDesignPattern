package AbstractFactoryPattern.HeroImplement;

import AbstractFactoryPattern.HeroInterface.Race;

/**
 * @author ziv
 * @date 2021-04-28 8:52 上午
 * @description 外星人
 */
public class Alien implements Race {
    @Override
    public void isManKind() {
        System.out.println("我是外星人");
    }
}
