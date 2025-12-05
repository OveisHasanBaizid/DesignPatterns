package structural.filter;

import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("MALE"))
                .toList();
    }
}