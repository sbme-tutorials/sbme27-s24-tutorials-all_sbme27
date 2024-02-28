import java.util.function.IntBinaryOperator;
import java.util.function.Function;

public class FunctionalCode {

    // Higher-Order Function that takes a binary operation function as an argument
    public static int applyOperation(int a, int b, IntBinaryOperator operation) {
        return operation.applyAsInt(a, b);
    }
    public static void main(String[] args) {
        // Implementing different operations using lambda expressions
        IntBinaryOperator add = (a, b) -> a + b;
        IntBinaryOperator subtract = (a, b) -> a - b;
        IntBinaryOperator multiply = (a, b) -> a * b;
        int x = 10;
        int y = 5;
        // Using Higher-Order Function to perform different operations
        int resultAdd = applyOperation(x, y, add);
        int resultSubtract = applyOperation(x, y, subtract);
        int resultMultiply = applyOperation(x, y, multiply);
        System.out.println("Addition: " + resultAdd); // Output: Addition: 15
        System.out.println("Subtraction: " + resultSubtract); // Output: Subtraction: 5
        System.out.println("Multiplication: " + resultMultiply); // Output: Multiplication: 50
    }

    // Create functions for adding 2 and multiplying by 3
    public static void composeFunctions() {
        Function<Integer, Integer> addTwo = x -> x + 2;
        Function<Integer, Integer> multiplyByThree = x -> x * 3;
        // Function composition using "andThen"
        Function<Integer, Integer> addAndMultiply = addTwo.andThen(multiplyByThree);
        // Apply the composed function to a value
        int result = addAndMultiply.apply(5);
        System.out.println("Result: " + result); // Output: Result: 21
    }

    public static void currying(String[] args) {
        // Define a function that takes two arguments and returns their sum
        Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;
        // Apply currying to the "add" function
        Function<Integer, Integer> add5 = add.apply(5);
        // Apply the partially applied function
        int result = add5.apply(3);
        System.out.println("Result: " + result); // Output: Result: 8
    }


}
