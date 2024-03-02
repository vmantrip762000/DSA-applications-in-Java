import java.util.Scanner;

public class binSearch {

    public static int binAlgo(int[] arr1, int target){
        /*
        This function takes an integer array and target value as the two input arguments.
        2 pointers are used to carry out hte binary search.
        Binary search effectively reduces number of comparisons performed when compare to linear search!
         */
        int p1 = 0;
        int p2 = arr1.length - 1;
        int mid = (p1 + p2) / 2;
        while(p1 <= p2){

            if(target < arr1[mid]){

                p2 = mid - 1;
                mid = (p1 + p2) / 2;

            }

            else if(target > arr1[mid]){

                p1 = mid + 1;
                mid = (p1 + p2) / 2;

            }

            else{

                return mid;
            }

        }

        return -1;

    }

    public static void main(String[] args){

        /*
        * The assumption here is that the input array is already sorted in ascending/descending order.
        * main contains 1 integer array and 2 integer variables.
        */

        int[] newNum = {2,5,6,9,10,15,19,21,23,27};
        int quant, res;
        Scanner in = new Scanner(System.in);
        System.out.println("Binary search will be use to find the element you enter below.");
        quant = in.nextInt();
        res = binAlgo(newNum, quant);
        if(res != -1){
            System.out.println("The element " + quant + " is found at index " + res);
        }
        else{
            System.out.println("Element not found!");
        }

    }
}
