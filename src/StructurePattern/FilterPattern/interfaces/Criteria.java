package StructurePattern.FilterPattern.interfaces;

import StructurePattern.FilterPattern.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> personList);
}
