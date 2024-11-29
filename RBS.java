public class RBS {



    public static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length - 1;
        while(start <= end){

            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){

                return mid;

            }
            if(mid > start && arr[mid] < arr[mid - 1]){

                return mid - 1;

            }
            if(arr[mid] <= arr[start]){

                end = mid - 1;

            } else{

                start = mid + 1;

            }

        }
        return -1;

    }

    public static int orderAgnosticBS(int[] myarr, int target, int start, int end){


        int ans = -1;
        // Binary search implementation

        boolean tORf = myarr[start] < myarr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;


            //System.out.println(mid);
            if(tORf) {

                if (target < myarr[mid]) {

                    end = mid - 1;

                } else if (target > myarr[mid]) {

                    start = mid + 1;
                }else{

                    ans = mid;
                    break;

                }

            } else{

                if (target < myarr[mid]) {

                    start = mid + 1;

                } else if (target > myarr[mid]) {

                    end = mid - 1;
                }
                else{

                    ans = mid;
                    break;
                }

            }

        }

        return ans;

    }

    public static int search(int[] nums, int target) {

        int pivotEle = findPivot(nums);
        if(pivotEle == -1){

            return orderAgnosticBS(nums, target, 0, nums.length - 1) ;

        }

        if(nums[pivotEle] == target){

            return pivotEle;

        }
        if(target > nums[0]){

            return orderAgnosticBS(nums, target, 0,pivotEle - 1);

        }
        if(target < nums[0]){

            return orderAgnosticBS(nums, target, pivotEle + 1, nums.length - 1);

        }
        return  -1;


    }

    public static void main(String[] args) {

        int[] myarr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(myarr));
        System.out.println(search(myarr, 6));

    }
}
