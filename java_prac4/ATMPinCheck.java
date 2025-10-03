package java_prac4;

import java.util.Scanner;
// practical
public class ATMPinCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PIN = 1111;
        int attempts = 1;
        final int MAX_ATTEMPTS = 3;
        boolean pinCorrect = false;

        System.out.println("Enter 4 digit PIN.");

        do {
            int userPIN = scanner.nextInt();

            if (userPIN == PIN) {
                System.out.println("PIN is Correct.");
                pinCorrect = true;
                break; // exit loop if PIN is correct
            } else {
                System.out.println("Please enter correct PIN!");
            }

            attempts++;
        } while (attempts <= MAX_ATTEMPTS);

        if (!pinCorrect) {
            System.out.println("Try Next Time.");
        }

        scanner.close();
    }
}
