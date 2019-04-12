package StructurePattern.FilterPattern.implement;

import StructurePattern.FilterPattern.Person;
import StructurePattern.FilterPattern.interfaces.Criteria;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;
    public AndCriteria(Criteria criteria,Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersions = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(firstCriteriaPersions);
    }
}
