//simple calculator
import java.util.*;

class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Diff = " + (a - b));
        System.out.println("Prod = " + (a * b));
        System.out.println("Div = " + (b != 0 ? (a / b) : "Error"));
    }
}
