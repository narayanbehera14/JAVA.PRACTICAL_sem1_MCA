
//take user input for a matrix and print its transpose
import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //original matrix
        System.out.println("Original matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
//output
//PS C:\Users\nbehe\Music\MCA\SEM 1\JAVA.PRACTICAL_sem1_MCA\java_prac8> javac transpose.java
// PS C:\Users\nbehe\Music\MCA\SEM 1\JAVA.PRACTICAL_sem1_MCA\java_prac8> java transpose.java 
// Enter the number of rows: 2
// Enter the number of columns: 2
// Enter the elements of the matrix:
// 1   
// 4
// 5
// 6
// Original matrix:
// 1 4
// 5 6
// Transpose of the matrix:
// 1 5
// 4 6
// PS C:\Users\nbehe\Music\MCA\SEM 1\JAVA.PRACTICAL_sem1_MCA\java_prac8> 
