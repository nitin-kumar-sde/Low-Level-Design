package design_patterns.behavioral.interpreter;

import design_patterns.behavioral.interpreter.expression.AddExpression;
import design_patterns.behavioral.interpreter.expression.Expression;
import design_patterns.behavioral.interpreter.expression.NumberExpression;
import design_patterns.behavioral.interpreter.expression.SubtractExpression;

import java.util.Stack;

/**
 * Parses and evaluates simple arithmetic expressions using the Interpreter pattern.
 * Supports addition and subtraction of integers.
 */
public class ExpressionParser {
    public Expression parse(final String input) {

        final Stack<Expression> stack = new Stack<>();
        final String[] tokens = input.split(" ");

        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    final Expression right = stack.pop();
                    final Expression left = stack.pop();
                    stack.push(new AddExpression(left, right));
                }
                case "-" -> {
                    final Expression right = stack.pop();
                    final Expression left = stack.pop();
                    stack.push(new SubtractExpression(left, right));
                }
                default -> stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }
        return stack.pop();
    }
}

