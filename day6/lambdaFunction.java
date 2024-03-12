import java.util.function.BiFunction;

public class lambdaFunction {
    
    public static double performOperation(double num1, double num2, char operator) {
        BiFunction<Double, Double, Double> operation = (x, y) -> {
            switch (operator) {
                case '+':
                    return x + y;
                case '-':
                    return x - y;
                case '*':
                    return x * y;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        };

        return operation.apply(num1, num2);
    }

    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = 3.0;
        char operator = '+';

        double result = performOperation(num1, num2, operator);
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
