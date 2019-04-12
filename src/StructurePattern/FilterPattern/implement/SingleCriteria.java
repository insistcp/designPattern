package StructurePattern.FilterPattern.implement;

import StructurePattern.FilterPattern.Person;
import StructurePattern.FilterPattern.interfaces.Criteria;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> personSingle = new ArrayList<>();
        for (Person person : personList ) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                personSingle.add(person);
            }
        }
        return personSingle;
    }
}
