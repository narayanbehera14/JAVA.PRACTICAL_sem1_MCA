package java_prac7;

public class SumOfArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum of array: " + sum);
    }
}

/*

 PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_8> javac -d out SumOfArray.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_8> java -cp out SumOfArray.java
1 2 3 
4 5 6
Sum of array: 21
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_8> 

 */