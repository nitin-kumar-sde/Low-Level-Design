package design_patterns.behavioral.interpreter;

import design_patterns.behavioral.interpreter.expression.Expression;

public class Main {

    public static void main(String[] args) {
        final ExpressionParser parser = new ExpressionParser();

        final String input = "5 3 + 2 -"; // postfix notation: (5 + 3) - 2
        final Expression expression = parser.parse(input);

        System.out.println("Expression: " + input);
        System.out.println("Result: " + expression.interpret());
    }

}
