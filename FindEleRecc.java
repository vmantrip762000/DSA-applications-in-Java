import java.util.ArrayList;

public class FindEleRecc {

    public static void main(String[] args) {

        int [] myArr = {1, 2, 5, 29, 15};
        int [] myArr2 = {3, 7, 25, 9, 18};
        int [] myArr3 = {5, 9, 35, 9, 49};
        System.out.println(findEle(myArr, 29, 0));
        System.out.println(findEleReverse(myArr2, 7, 4));
        findAllEle(myArr3, 9, 0);
        System.out.println(myList);

    }

    static int findEle(int[] arr, int target, int index){

        if(index == arr.length - 1){

            return  -1;

        }

        if(arr[index] == target){

            return index;

        } else{

            return  findEle(arr, target, index + 1);

        }

    }

    static int findEleReverse(int[] arr, int target, int index){

        if(index == -1){

            return -1;

        }

        if(arr[index] == target){

            return index;

        } else{

            return findEleReverse(arr, target, index - 1);

        }

    }

    static ArrayList<Integer> myList = new ArrayList<>();
    static void findAllEle(int[] arr, int target, int index){

        if(index == arr.length - 1){

            return;

        }

        if(arr[index] == target){

            myList.add(index);

        }
        findAllEle(arr, target, index + 1);

    }

}
