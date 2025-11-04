import java.util.Scanner;

public class ParametersWithInput {

    // Method with parameters
    static void displayDetails(String name, int age) {
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();
        // Calling method with arguments
        displayDetails(userName, userAge);

        sc.close();
    }


}