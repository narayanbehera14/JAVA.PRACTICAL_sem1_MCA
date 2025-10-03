import java.util.Scanner;
// practical
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a valid ID? (true/false): ");
        boolean hasID = scanner.nextBoolean();

        // Check conditions: age between 18 and 60, and valid ID
        if (age >= 18 && age <= 60 && hasID) {
            System.out.println("✅ You are allowed to enter.");
        } else {
            System.out.println("❌ Entry denied. Age must be between 18 and 60 and you must have a valid ID.");
        }

        scanner.close();
    }
}
