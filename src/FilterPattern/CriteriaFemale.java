package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ziv
 * @date 2021-06-14 1:22 下午
 * @description
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femaleCriteria = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femaleCriteria.add(person);
            }
        }
        return femaleCriteria;
    }
}
