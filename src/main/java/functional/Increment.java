package functional;

public class Increment {


    public static void main(String[] args) {
        Function<Integer, Integer> function =  t -> t + 1;
        Integer result = function.apply(4);
        System.out.println(result);
    }
}
