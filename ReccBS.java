public class ReccBS {

    public static void main(String[] args) {

        int[] myArr = {2,4,7, 11, 15, 21};
        int s = 0;
        int e = myArr.length;
        System.out.println(reccBS(myArr, 15, s, e));

    }

    static int reccBS(int[] arr, int target, int s, int e){

        int m = s + (e - s)/2;
        if(arr[m] ==  target){

            return m;

        }

        if(target < arr[m]){

            return reccBS(arr, target, s, m - 1);

        }

        return reccBS(arr, target, m + 1, e);

    }

}
