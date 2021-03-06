package StructurePattern.FilterPattern.implement;

import StructurePattern.FilterPattern.Person;
import StructurePattern.FilterPattern.interfaces.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> personMale = new ArrayList<>();
        for (Person person : personList ) {
            if (person.getGender().equalsIgnoreCase("female")) {
                personMale.add(person);
            }
        }
        return personMale;
    }
}
