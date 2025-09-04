package design_patterns.structural.criteria.model;

public class Employee {
    private final String name;
    private final String gender;
    private final double salary;

    public Employee(String name, String gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getGender() { return gender; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + gender + ", " + salary + ")";
    }
}
