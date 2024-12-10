import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr ={-1, -32, 89, 101, 24};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int [] arr){

        for (int i = 0; i < arr.length; i++){

            boolean swapped = false;

            for(int j = 1; j < arr.length - i; j++){

                if(arr[j] < arr[j - 1]){

                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                    swapped = true;

                }

            }

            if(!swapped){

                break;

            }

        }

    }

}
