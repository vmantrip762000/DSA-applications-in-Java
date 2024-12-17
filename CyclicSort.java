import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] myArr = {3, 5, 2, 1, 4};
        sort(myArr);
        System.out.println(Arrays.toString(myArr));

    }

    static void Swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static void sort(int[] arr){

        int i = 0;
        while(i < arr.length){

            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){

                Swap(arr, i, correct);

            } else{

                i++;

            }

        }

    }



}
