import java.util.*;
import static java.lang.System.out;

public class RowColMatrix {

    public static void main(String[] args){

        int [][] arr = {{10, 20, 30},
                        {40, 50, 60},
                        {70, 80, 90}};

        int[] res;
        res = searchMat(arr, 50);
        System.out.println(Arrays.toString(res));

    }

    static int[] searchMat(int[][] matrix, int target) {

        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length & c >= 0) {
            if (matrix[r][c] == target) {

                return new int[]{r, c};

            }

            if (matrix[r][c] < target) {

                r++;

            } else {

                c--;

            }
        }
        return new int[]{-1,-1};

    }

}
