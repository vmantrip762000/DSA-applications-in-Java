
import java.util.Arrays;

public class Mainbubsort {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] newArr = {5,4,3,2,1};
        System.out.println(Arrays.toString(bubsort(newArr)));
    }

    public static int[] bubsort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            boolean swap = false;

            for(int j = 1; j < arr.length - i; j++){


                if(arr[j] < arr[j-1]){

                    int temp = arr[j];
                    arr[j] = arr [j-1];
                    arr[j-1] = temp;
                    swap = true;

                }

            }

            if(!swap){
                break;
            }
        }
        return  arr;

    }
}