package calculator;

public class Calculator {

    // Método para sumar dos números
    public int add(int a, int b) {
        return a + b;
    }

    // Puedes añadir más operaciones si quieres
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }
}

