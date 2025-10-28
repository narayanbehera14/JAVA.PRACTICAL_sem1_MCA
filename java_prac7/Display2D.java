package java_prac8;

public class Display2D {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 4}, 
            {5, 7, 9}
        };

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // for (int[] arr1 : arr) {
        //     for (int j = 0; j < arr1.length; j++) {
        //         System.out.print(arr1[j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}


/*
 
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_8> javac -d out Display2D.java
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_8> java -cp out Display2D.java
2 3 4 
5 7 9
PS C:\Users\hp\Desktop\MCA\Semester-1\JAVA_MCA_SEM_1\session_8> 

 */