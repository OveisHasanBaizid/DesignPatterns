package structural.filter;

import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getMaritalStatus().equalsIgnoreCase("SINGLE"))
                .toList();
    }
}