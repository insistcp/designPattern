package StructurePattern.FilterPattern.implement;

import StructurePattern.FilterPattern.Person;
import StructurePattern.FilterPattern.interfaces.Criteria;

import java.util.List;

public class OtherCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;
    public OtherCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersions = criteria.meetCriteria(personList);
        List<Person> secondCriteriaPersions = otherCriteria.meetCriteria(personList);
        for (Person person:secondCriteriaPersions) {
            if ( !firstCriteriaPersions.contains(person)) {
                firstCriteriaPersions.add(person);
            }
        }
        return firstCriteriaPersions;
    }
}
