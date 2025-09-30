//write a java program using for loop to print nu. from 50 to 60. from this series identify and display only the even nu.

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Numbers from 50 to 60:");

        // Print all numbers 50–60
        for (int i = 50; i <= 60; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nEven numbers between 50 to 60:");

        // Print only even numbers
        for (int i = 50; i <= 60; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
