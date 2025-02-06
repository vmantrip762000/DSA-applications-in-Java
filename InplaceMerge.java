import java.util.Arrays;

public class InplaceMerge {

    public static void main(String[] args) {

        int[] myArr = {5, 4, 3, 2, 1};
        mergeSortInPlace(myArr, 0, myArr.length);
        System.out.println(Arrays.toString(myArr));

    }

    static void mergeSortInPlace(int[] arr, int s, int e){

        if(e - s == 1){

            return;

        }

        int mid = (s + e)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);

    }

    static void mergeInPlace(int[] arr, int s, int m, int e){

        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e){

            if(arr[i] < arr[j]){

                mix[k] = arr[i];
                i++;

            } else{

                mix[k] = arr[j];
                j++;

            }

            k++;

        }

        while (i < m) {

            mix[k] = arr[i];
            i++;
            k++;

        }

        while (j < e){

            mix[k] = arr[j];
            j++;
            k++;

        }

        //it may be possible one of the arrays is not complete
        // in that case copy the remaining elements
        for(int l = 0; l < mix.length; l++){

            arr[s + l] = mix[l];

        }

    }

}
