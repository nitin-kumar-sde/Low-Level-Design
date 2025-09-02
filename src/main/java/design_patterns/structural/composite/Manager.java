package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a manager (composite node) in the composite structure.
 */
public class Manager implements Employee {
    private final String name;
    private final String department;
    private final List<Employee> team = new ArrayList<>();

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void removeEmployee(Employee employee) {
        team.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("👔 Manager: " + name + " | Department: " + department);
        System.out.println("  Team:");
        for (Employee e : team) {
            System.out.print("   - ");
            e.showDetails();
        }
    }
}

