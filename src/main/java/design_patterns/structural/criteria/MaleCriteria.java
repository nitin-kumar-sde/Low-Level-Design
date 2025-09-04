package design_patterns.structural.criteria;


import design_patterns.structural.criteria.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Criteria implementation for filtering Male users.
 */
public class MaleCriteria implements Criteria {

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toList());
    }

}