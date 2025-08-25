package functional;

import java.util.List;

public class Streams {
    public static void main(String[] args) {

        List<Integer> rollNumbers = List.of(1,2,3,4,5);
        List<Integer> collect = rollNumbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
    }
}
