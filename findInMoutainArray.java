/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class findInMoutainArray {

    public int peakIndexInMountainArray(MountainArray mountainArr) {

        int start = 0;
        int end = mountainArr.length() - 1;

        while(start < end){

            int mid = start + (end - start)/2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)){

                //descending part of array. So peak can be to the left

                end = mid;

            } else{

                //Ascending part of array. So check to the right side by making start as mid + 1
                start = mid + 1;

            }

        }
        return start;



    }

    public static int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end){


        int ans = -1;
        // Binary search implementation

        boolean tORf = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;


            //System.out.println(mid);
            if(tORf) {

                if (target < mountainArr.get(mid)) {

                    end = mid - 1;

                } else if (target > mountainArr.get(mid)) {

                    start = mid + 1;
                }else{

                    ans = mid;
                    break;

                }

            } else{

                if (target < mountainArr.get(mid)) {

                    start = mid + 1;

                } else if (target > mountainArr.get(mid)) {

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

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr,target, 0, peak);
        if(firstTry != -1){
            return firstTry; 
        }
        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);



        
    }
}
