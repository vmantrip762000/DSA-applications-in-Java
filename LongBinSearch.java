public class LongBinSearch {




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

    public static int fixRange(int[] arr, int target){

        int startVal = 0;
        int endVal = 1;
        while(arr[endVal] < target){

            int newStart = endVal + 1;
            endVal = newStart + (endVal - startVal + 1) * 2;
            startVal = newStart;


        }

        return orderAgnosticBS(arr, target, startVal, endVal);


    }


    public static void main(String[] args) {

        System.out.println("We are doing binary search");
        int[] arr = {0, 4, 5, 6, 8, 9, 12, 15};
        int eleFound = fixRange(arr, 5);
        System.out.println(eleFound);

    }

}
