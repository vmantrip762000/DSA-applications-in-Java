import java.util.Arrays;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] myArr = {3, 5, 5, 1, 4};
        int myVal = findDuplicates(myArr);
        System.out.println(myVal);

    }

    static void Swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static int findDuplicates(int[] arr){

        int i = 0;
        while(i < arr.length){


            if(arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {

                    Swap(arr, i, correct);

                } else {

                    return arr[i];

                }
            } else{

                i++;

            }

        }

        return -1;

    }



}
