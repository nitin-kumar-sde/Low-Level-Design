package design_patterns.structural.criteria.composite;

import design_patterns.structural.criteria.Criteria;
import design_patterns.structural.criteria.model.Employee;

import java.util.List;
/**
 * Composite Criteria implementation for combining two criteria with a logical AND operation.
 */
public class OrCriteria implements Criteria {
    private final Criteria criteria;
    private final Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> firstCriteriaItems = criteria.meetCriteria(employees);
        List<Employee> secondCriteriaItems = otherCriteria.meetCriteria(employees);

        secondCriteriaItems.stream()
                .filter(e -> !firstCriteriaItems.contains(e))
                .forEach(firstCriteriaItems::add);

        return firstCriteriaItems;
    }
}