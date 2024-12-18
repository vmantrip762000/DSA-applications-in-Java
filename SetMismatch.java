import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {

        int[] myArr = {3, 5, 5, 1, 4};
        int[] myVal = sort(myArr);
        System.out.println(Arrays.toString(myVal));

    }

    static void Swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


    static int[] sort(int[] arr){

        int i = 0;
        while(i < arr.length){

            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {

                Swap(arr, i, correct);

            } else {

                i++;

            }

        }

        for(int j = 0; j < arr.length; j++){

            if(arr[j] != j + 1){

                return new int[] {arr[j], j + 1};

            }

        }

        return new int[] {-1, -1};

    }



}
