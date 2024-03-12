import java.util.Arrays;
import java.util.Scanner;

public class arrSortReverse {

    static int maxVal(int[] q){
        /*
        * Single for loop is used to return the maximum value of input array.
        */
        int op = q[0];
        for(int j = 0; j < q.length - 1; j++){
            if (q[j] > op){
                op = q[j];

            }
        }
        return op;
    }


    static void swap(int[] p){
        /*
        * 2 pointer logic is used to reverse the array.
        */
        int p1 = 0;
        int p2 = p.length - 1;
        int temp;
        while (p1 < p2) {
            temp = p[p1];
            p[p1] = p[p2];
            p[p2] = temp;
            p1 += 1;
            p2 -= 1;
        }
        System.out.println(Arrays.toString(p));
    }

    public static void main (String[] args){

        /*
        * swap function is used to perform in place swap of input array
        * maxVal function returns maximum value of the input array.
        */

        int[] arr1 = new int[7];
        int maxOp;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the value for index " + i);
            arr1[i] = in.nextInt();
        }
        System.out.println("You have created the array " + Arrays.toString(arr1));

        System.out.println("The reversed form of the array you have entered is shown below.");
        swap(arr1);
        System.out.println("The maximum value of the array is " + maxVal(arr1));

        }
    }


