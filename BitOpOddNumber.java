public class BitOpOddNumber {

    public static void main(String[] args) {

        int [] myArr = {4, 4, 3, 7, 7, 9, 9, 6, 6};
        System.out.println(OddNumberOcc(myArr));



    }

    private static int OddNumberOcc(int[] arr){

        int opVal = arr[0];
        for(int i = 1; i < arr.length; i++){

            opVal ^= arr[i];

        }

        return opVal;

    }

}
