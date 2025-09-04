package design_patterns.functional.combinator;


@FunctionalInterface
public interface Validator {

    boolean validate(User user);

    static Validator notBlank() {
        return value -> (value != null && !value.getName().isBlank());
    }

    static Validator matchesRegex(String regex) {
        return value -> value != null && value.getName().matches(regex);
    }

    default Validator and(Validator other) {
        return t -> this.validate(t) && other.validate(t);
    }

}
