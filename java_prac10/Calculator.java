package java_prac10;
import java.util.Scanner;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int mult(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Choose operation:");
        System.out.println("1. Add");
        System.out.println("2. Multiply");
        System.out.println("3. Divide");

        int choice = sc.nextInt();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + c.add(a, b));
                break;
            case 2:
                System.out.println("Result: " + c.mult(a, b));
                break;
            case 3:
                System.out.println("Result: " + c.div(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
