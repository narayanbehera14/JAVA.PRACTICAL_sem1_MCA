// public class NestedIfExample {
//     public static void main(String[] args) {
//         int age = 20;
//         boolean isCitizen = true;

//         if (age >= 18) {   // First condition: check age
//             if (isCitizen) {   // Nested condition: check citizenship
//                 System.out.println("You are eligible to vote!");
//             } else {
//                 System.out.println("You must be a citizen to vote.");
//             }
//         } else {
//             System.out.println("You must be at least 18 years old to vote.");
//         }
//     }
// }
import java.util.Scanner;
// nested if statement are useful when you need to test multiple condition that depend on each other checking if a person is old enough to vote and they are a citizen 
public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you a citizen of India? (true/false): ");
        boolean isCitizen = sc.nextBoolean();

        // Nested if check
        if (age >= 18) {   // First condition: check age
            if (isCitizen) {   // Nested condition: check citizenship
                System.out.println(" You are eligible to vote!");
            } else {
                System.out.println(" You must be a citizen to vote.");
            }
        } else {
            System.out.println(" You must be at least 18 years old to vote.");
        }

        sc.close();
    }
}
