public class MountainArray {

    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){

                //descending part of array. So peak can be to the left

                end = mid;

            } else{

                //Ascending part of array. So check to the right side by making start as mid + 1
                start = mid + 1;

            }

        }
        return start;



    }

}
