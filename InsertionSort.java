import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] myArr = {0, -32, 56, 18};
        insertionSort(myArr);
        System.out.println(Arrays.toString(myArr));


    }

    static void Swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


    static void insertionSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){

            for(int j = i + 1; j > 0; j--){

                if(arr[j] < arr[j - 1]){

                    Swap(arr, j, j - 1);

                } else {

                    break;

                }

            }

        }

    }
}
