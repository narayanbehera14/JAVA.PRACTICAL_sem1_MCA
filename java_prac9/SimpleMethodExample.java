import java.util.Scanner;

public class SimpleMethodExample {

    // A void method that takes a name as input and prints a message
    void displayMessage(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input
        
        System.out.print("Enter your name: ");
        String userName = sc.nextLine(); // Take input from user

        // Create object of the class to call the non-static method
        SimpleMethodExample obj = new SimpleMethodExample();
        obj.displayMessage(userName); // Call the void method with user input

        sc.close(); // Close the scanner
    }
}