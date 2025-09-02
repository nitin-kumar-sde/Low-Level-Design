package design_patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        // Individual developers (leaves)
        Employee dev1 = new Developer("Alice", "Backend Developer");
        Employee dev2 = new Developer("Bob", "Frontend Developer");
        Employee dev3 = new Developer("Charlie", "Mobile Developer");

        // Manager (composite)
        Manager techLead = new Manager("David", "Engineering");
        techLead.addEmployee(dev1);
        techLead.addEmployee(dev2);

        // Higher-level manager (composite of composites)
        Manager cto = new Manager("Eve", "CTO");
        cto.addEmployee(techLead);
        cto.addEmployee(dev3);

        // Display the hierarchy
        System.out.println("=== Company Structure ===");
        cto.showDetails();
    }
}
