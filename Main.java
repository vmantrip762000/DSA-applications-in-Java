import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void printMat(int[][] arr){

        for(int i=0; i < arr.length;i++){

            for (int j=0; j < arr.length; j++){

                System.out.printf(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello. We will learn arrays today!");

        int[] ros; //Declaration of array name in stack memory
        ros = new int[5]; //allocation of memory space in heap
        ros[0] = 1;
        ros[1] = 2;
        ros[2] = 3;
        ros[3] = 4;
        ros[4] = 5;
        System.out.println(Arrays.toString(ros));

        /*

        for (int num : ros){

            System.out.println(ros[num]);

        }

        */

        for (int i=0; i <= ros.length - 1; i++){

            System.out.println(ros[i]);

        }

        //multidimensional arrays and functions with array arguments
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        printMat(arr1);


    }
}