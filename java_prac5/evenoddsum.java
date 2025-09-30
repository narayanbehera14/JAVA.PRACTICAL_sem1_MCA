import java.util.Scanner;

public class evenoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for range
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        // Loop through the range
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;  // add even numbers
            } else {
                oddSum += i;   // add odd numbers
            }
        }

        // Print results
        System.out.println("Sum of Even numbers between " + start + " and " + end + " = " + evenSum);
        System.out.println("Sum of Odd numbers between " + start + " and " + end + " = " + oddSum);

        sc.close();
    }
}
