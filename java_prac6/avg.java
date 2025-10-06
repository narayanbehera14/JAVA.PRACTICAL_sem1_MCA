public class avg {
    public static void main(String[] args) {
        int[] ages={34,54,332,45,24,546};
        float sum=0;
        float avg;

        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
            
        }
        avg = sum/ages.length;
        System.out.println("Average "+avg);

        
        }
    }

//create array to find smalles for values PS C:\Users\nbehe\Music\MCA\SEM 1\JAVA.PRACTICAL_sem1_MCA\java_prac6> javac avg.java  
// PS C:\Users\nbehe\Music\MCA\SEM 1\JAVA.PRACTICAL_sem1_MCA\java_prac6> java avg
// Average 172.5
// PS C:\Users\nbehe\Music\MCA\SEM 1\JAVA.PRACTICAL_sem1_MCA\java_prac6> 