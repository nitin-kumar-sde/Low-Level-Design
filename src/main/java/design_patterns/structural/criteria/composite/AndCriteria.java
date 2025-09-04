package design_patterns.structural.criteria.composite;

import design_patterns.structural.criteria.Criteria;
import design_patterns.structural.criteria.model.Employee;

import java.util.List;

/**
 * Composite Criteria implementation for combining two criteria with a logical AND operation.
 */
public class AndCriteria implements Criteria {
    private final Criteria criteria;
    private final Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        return otherCriteria.meetCriteria(criteria.meetCriteria(employees));
    }
}
