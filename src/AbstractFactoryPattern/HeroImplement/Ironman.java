package AbstractFactoryPattern.HeroImplement;

import AbstractFactoryPattern.HeroInterface.Hero;
import com.sun.net.httpserver.Headers;

/**
 * @author ziv
 * @date 2021-04-28 8:39 上午
 * @description
 */
public class Ironman implements Hero {
    @Override
    public void skill() {
        System.out.println("老子有酷炫的鋼鐵裝");
    }
}
