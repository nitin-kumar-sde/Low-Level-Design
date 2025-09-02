package design_patterns.structural.composite;

/**
 * Represents a terminal employee (leaf node) in the composite structure.
 */
public class Developer implements Employee {
    private final String name;
    private final String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("👨‍💻 Developer: " + name + " | Position: " + position);
    }
}

