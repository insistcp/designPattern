package StructurePattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates = new ArrayList<>();
    public Employee(String name,String dept,int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return  ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
