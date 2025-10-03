public class smaller {
    public static void main(String[] args) {
        int[] number={12,34,12,45,21,55};
        int num=number[0];

        for(int i=1; i<number.length;i++){
            if(number[i]<num){
                num=number[i];

            }
        }
        System.out.println("small number is in array:" +num);
    }
}
