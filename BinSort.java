//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinSort {

    public static int orderAgnosticBS(int[] myarr, int target){

        int start = 0;
        int end = myarr.length - 1;
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


    public static void main(String[] args) {

        System.out.println("We are doing binary search");
        int[] arr = {0, 4, 5, 6, 8, 9, 12, 15};
        int eleFound = orderAgnosticBS(arr, 5);
        System.out.println(eleFound);
        int[] revarr = {15, 12, 9, 8, 6, 5, 4, 0};
        int revEle = orderAgnosticBS(revarr, 5);

        System.out.println(revEle);
    }

}
