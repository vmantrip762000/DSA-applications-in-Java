import java.util.Arrays;

public class SelectionSort {

    //Selection sort

    public static void main(String[] args) {

        int[] myArr = {3, 1, 5, 2, 4};
        selectionSort(myArr);
        System.out.println(Arrays.toString(myArr));

    }

    //Find max element in remaining array and swap with correct index
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            Swap(arr, maxIndex, last);

        }
    }

    static void Swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    private static int getMaxIndex(int[] arr, int start, int end){

        int max = start;
        for(int i = start; i <= end; i++){

            if(arr[max] < arr[i]){

                max = i;

            }

        }

        return max;

    }

}
