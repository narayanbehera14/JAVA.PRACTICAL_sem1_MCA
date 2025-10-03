import java.util.*;

class checkfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 5) {
            System.out.println(num + " is greater than 5");
        } else {
            System.out.println(num + " is not greater than 5");
        }
    }
}
