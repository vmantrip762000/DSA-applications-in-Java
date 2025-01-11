public class Sum1toN {

    public static void main(String[] args) {

        int sumToN = sumOp(5);
        System.out.println(sumToN);

    }

    static int sumOp(int n){

        if(n <= 1){

            return 1;

        }
        return n + sumOp(n - 1);

    }
}
