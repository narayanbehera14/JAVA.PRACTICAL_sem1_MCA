import java.util.Scanner;

public class inhertance {
 class Student {
        protected String name;
        protected String rollNumber;
        protected int totalMarks;
    }

    class Details extends Student {

        void getInput() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            rollNumber = sc.nextLine();

            System.out.print("How many subjects? ");
            int n = sc.nextInt();

            totalMarks = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int mark = sc.nextInt();
                totalMarks += mark;       // add marks
            }
        }

        void display() {
            System.out.println("\n--- Student Details ---");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Total Marks: " + totalMarks);
        }
    }

    public static void main(String[] args) {
         inhertance obj = new inhertance();
        Details d = obj.new Details();

        d.getInput();
        d.display();
    }
}