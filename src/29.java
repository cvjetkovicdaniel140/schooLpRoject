import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        for(int i = 0; i < num2; i++) {
            System.out.print(num1 + " * " + i + " = " + (num1 * i));
        }
    }
}
