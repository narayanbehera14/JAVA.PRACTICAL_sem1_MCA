import java.util.Scanner;
// notebook lekhna hai 
// exapmle of a nested if program in java that checks a number and print whether it is postitve , negtive or zero and additionally whether it is even or odd if it is positive
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Outer if checks if number is positive, negative, or zero
        if (num > 0) {
            System.out.println("The number is Positive.");

            // Nested if → check even or odd only if positive
            if (num % 2 == 0) {
                System.out.println("It is also Even.");
            } else {
                System.out.println("It is also Odd.");
            }

        } else if (num < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}
