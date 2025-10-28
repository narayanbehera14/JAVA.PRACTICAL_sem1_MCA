package java_prac8;

public class index {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Skip primary and secondary diagonal elements
                if (i != j && i + j != n - 1) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Sum of non-diagonal elements: " + sum);
    }
}
//output 
//PS C:\Users\nbehe\Music\MCA\SEM 1\JAVA.PRACTICAL_sem1_MCA\java_prac8> java index.java
//Sum of non-diagonal elements: 20




