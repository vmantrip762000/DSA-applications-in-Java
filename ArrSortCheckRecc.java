public class ArrSortCheckRecc {

    public static void main(String[] args) {

        int [] myArr = {1, 2, 5, 29, 15};
        System.out.println(sorted(myArr, 0));

    }

    static boolean sorted(int [] arr, int index){

        if(index == arr.length - 1){

            return true;

        }

        return (arr[index] < arr[index + 1]) && sorted(arr, index + 1);

    }

}
