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

//create array to find smalles for values 