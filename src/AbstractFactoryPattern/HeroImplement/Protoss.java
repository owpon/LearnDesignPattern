package AbstractFactoryPattern.HeroImplement;

import AbstractFactoryPattern.HeroInterface.Race;

/**
 * @author ziv
 * @date 2021-04-28 8:53 上午
 * @description 神族
 */
public class Protoss implements Race {
    @Override
    public void isManKind() {
        System.out.println("我是阿薩神族");
    }
}
