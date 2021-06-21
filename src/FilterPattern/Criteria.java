package FilterPattern;

import java.util.List;

/**
 * @author ziv
 * @date 2021-06-14 1:18 下午
 * @description 建立一個接口
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
