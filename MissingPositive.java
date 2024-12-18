import java.util.Arrays;

public class MissingPositive {

    public static void main(String[] args) {

        int[] myArr = {3, 5, 5, 1, 4};
        int myVal = firstMissingPositive(myArr);
        System.out.println(myVal);

    }

    static void Swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static int firstMissingPositive(int[] arr){

        int i = 0;
        while(i < arr.length){

            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[correct] != arr[i] && arr[i] <= arr.length){

                Swap(arr, i, correct);

            } else{

                i++;

            }

        }

        for(int j = 0; j < arr.length; j++){

            if(arr[j] != j + 1){

                return j + 1;

            }

        }

        return arr.length + 1;

    }
}
