package combinator;

import lombok.Getter;

@Getter
public class User {
    String name;
    String email;
    Integer age;

    public User(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
