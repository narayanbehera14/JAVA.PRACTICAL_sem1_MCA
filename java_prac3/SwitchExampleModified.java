import java.util.Scanner;

public class SwitchExampleModified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0 to 5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Zero selected.");
                break;
            case 1:
                System.out.println("You selected One.");
                break;
            case 2:
                System.out.println("You selected Two.");
                break;
            case 3:
                System.out.println("You selected Three.");
                break;
            case 4:
                System.out.println("You selected Four.");
                break;
            case 5:
                System.out.println("You selected Five.");
                break;
            default:
                System.out.println("❌ Invalid choice! Please enter a number between 0 and 5.");
        }

        scanner.close();
    }
}
