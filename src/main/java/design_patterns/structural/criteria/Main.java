package design_patterns.structural.criteria;

import design_patterns.structural.criteria.composite.AndCriteria;
import design_patterns.structural.criteria.composite.OrCriteria;
import design_patterns.structural.criteria.model.Employee;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Male", 50000),
                new Employee("Sarah", "Female", 70000),
                new Employee("Mike", "Male", 90000),
                new Employee("Emma", "Female", 30000)
        );

        Criteria male = new MaleCriteria();
        Criteria highSalary = new HighSalaryCriteria(60000);

        Criteria maleAndHighSalary = new AndCriteria(male, highSalary);
        Criteria maleOrHighSalary = new OrCriteria(male, highSalary);

        System.out.println("Male Employees: " + male.meetCriteria(employees));
        System.out.println("High Salary Employees: " + highSalary.meetCriteria(employees));
        System.out.println("Male AND High Salary: " + maleAndHighSalary.meetCriteria(employees));
        System.out.println("Male OR High Salary: " + maleOrHighSalary.meetCriteria(employees));
    }
}
