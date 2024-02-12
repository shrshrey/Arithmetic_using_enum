package arithmetic;

// Enum to represent arithmetic operations
enum Operation {
    PLUS, MINUS, TIMES, DIVIDE
}

// Interface for arithmetic operations
interface Calculator {
    double calculate(double x, double y);
}

// Implementations of the Calculator interface
class Addition implements Calculator {
    public double calculate(double x, double y) {
        return x + y;
    }
}

class Subtraction implements Calculator {
    public double calculate(double x, double y) {
        return x - y;
    }
}

class Multiplication implements Calculator {
    public double calculate(double x, double y) {
        return x * y;
    }
}

// Division class should be included in a separate file or within the same file
class Division implements Calculator {
    public double calculate(double x, double y) {
        return x / y;
    }
}

/**
 * This class takes Operation enum input from the user and delegates the arithmetic operation
 * to the corresponding Calculator implementation.
 * 
 * @author shreya shreya (991713126)
 * 
 */
public class ArithmeticBase {
    double calculate(double x, double y, Operation operation) {
        Calculator calculator;
        
        // Use a factory method or Dependency Injection to instantiate the appropriate calculator
        switch (operation) {
            case PLUS:
                calculator = new Addition();
                break;
            case MINUS:
                calculator = new Subtraction();
                break;
            case TIMES:
                calculator = new Multiplication();
                break;
            case DIVIDE:
                calculator = new Division();
                break;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
        
        return calculator.calculate(x, y);
    }
}