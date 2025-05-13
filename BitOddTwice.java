import java.util.Arrays;

public class BitOddTwice {

    public static void main(String[] args) {

        int [] myArr = {4, 4, 3, 7, 7, 9, 9, 6, 6, 2};
        System.out.println(Arrays.toString(OddNumberOcc(myArr)));

    }

    private static int[] OddNumberOcc(int[] arr){


        int x = arr[0];
        for(int i = 0; i < arr.length; i++){

            x ^= arr[i];

        }

        int k = (x & ~(x - 1));
        int res1 = 0;
        int res2 = 0;
        for(int  i = 0; i < arr.length; i++){

            if((arr[i]&k) != 0){

                res1 = res1 ^ arr[i];

            } else {

                res2 = res2 ^ arr[i];

            }

        }


        return new int[]{res1, res2};

    }

}
