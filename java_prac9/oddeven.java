package allmethods;

import java.util.Scanner;

public class oddeven {
    static void OddEven(int n){
        for(int i=0; i<n; i++){
            if(n%2==0){
                System.out.println("Eve Number");
            }else{
                System.out.println("Odd Number");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= sc.nextInt();

        sc.close();
    OddEven(n);
    }
}