package structural.filter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        Set<Person> result = new LinkedHashSet<>(criteria.meetCriteria(persons));
        result.addAll(otherCriteria.meetCriteria(persons));
        return new ArrayList<>(result);
    }
}