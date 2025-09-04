package design_patterns.functional.combinator;

public class Main {

    public static void main(String[] args) {
        User user = new User("Nitin",
                "nitin@example.com", 25);

        boolean isValid = Validator.notBlank()
                .and(Validator.matchesRegex("^[A-Za-z0-9+_.-]+@(.+)$"))
                .validate(user);

        System.out.println( isValid ? "Valid User" : "Invalid User");
    }
}