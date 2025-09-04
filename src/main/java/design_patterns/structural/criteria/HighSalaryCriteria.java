package design_patterns.structural.criteria;

import design_patterns.structural.criteria.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Criteria implementation for filtering employees with high salary.
 */
public class HighSalaryCriteria implements Criteria {
    private final double threshold;

    public HighSalaryCriteria(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getSalary() >= threshold)
                .collect(Collectors.toList());
    }
}
