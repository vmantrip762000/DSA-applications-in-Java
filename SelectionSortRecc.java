import java.util.Arrays;

public class SelectionSortRecc {

    public static void main(String[] args) {

        int[] myarr = {3, 4, 1, 2};
        selectionRecc(myarr, myarr.length, 0, 0);
        System.out.println(Arrays.toString(myarr));

    }

    static void selectionRecc(int[] arr, int r, int c, int max){

        if(r == 0){

            return;

        }

        if(c < r){

            if(arr[c] > arr[max]){

                selectionRecc(arr, r, c + 1, c);

            } else{

                selectionRecc(arr, r, c + 1, max);

            }


        } else{

            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selectionRecc(arr, r - 1, 0, 0);

        }

    }

}
