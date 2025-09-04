package design_patterns.structural.criteria;

import design_patterns.structural.criteria.model.Employee;

import java.util.List;

/**
 * Criteria interface for filtering employees based on different criteria.
 */
public interface Criteria {
    List<Employee> meetCriteria(List<Employee> employees);
}
