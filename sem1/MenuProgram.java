
import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Find Even or Odd");
        System.out.println("2. Find Square of a Number");
        System.out.println("3. Find Cube of a Number");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int n1 = sc.nextInt();
                if (n1 % 2 == 0)
                    System.out.println("Number is Even");
                else
                    System.out.println("Number is Odd");
                break;

            case 2:
                System.out.print("Enter a number: ");
                int n2 = sc.nextInt();
                System.out.println("Square = " + (n2 * n2));
                break;

            case 3:
                System.out.print("Enter a number: ");
                int n3 = sc.nextInt();
                System.out.println("Cube = " + (n3 * n3 * n3));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
