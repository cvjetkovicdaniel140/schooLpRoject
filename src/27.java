public class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        int result1 = add(5, 3);
        System.out.println(result1);

        int result2 = subtract(8, 4);
        System.out.println(result2);

        int result3 = multiply(7, 6);
        System.out.println(result3);

        double result4 = divide(10, 2.5);
        System.out.println(result4);

        try {
            int result5 = divide(10, 0);
            System.out.println(result5);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
