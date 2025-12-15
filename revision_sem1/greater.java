
import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter Number:");

            int num = scanner.nextInt();

            if (num > 5) {
                System.out.println(num + " is greater than 5.");
            
            }else {
                System.out.println(num + " is less than or equal to 5");

            }
        }
    }
    
}
