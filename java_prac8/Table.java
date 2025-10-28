package java_prac8;

public class Table {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int psum = 0;
        int ssum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            psum += matrix[i][i];
            ssum += matrix[i][n - i - 1];
        }

        System.out.println("Sum of primary diagonal elements: " + psum);
        System.out.println("Sum of secondary diagonal elements: " + ssum);
    }
}
//output
//PS C:\Users\nbehe\Music\MCA\SEM 1\JAVA.PRACTICAL_sem1_MCA> cd java_prac8
// >> mv table.java Table.java
// >> javac Table.java
// >> cd ..
// >> java java_prac8.Table
// >>
// Sum of primary diagonal elements: 15
// Sum of secondary diagonal elements: 15

//java program for diagonal matrix addition
