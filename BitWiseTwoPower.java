public class BitWiseTwoPower {

    public static void main(String[] args) {

        boolean opNaive1 = naivePower(6);
        boolean opNaive2 = naivePower(8);
        System.out.println(opNaive1);
        System.out.println(opNaive2);
        System.out.println(EffPower(6));
        System.out.println(EffPower(8));

    }

    public static boolean naivePower(int n){

        //Time Complexity: O(log N)

        while(n != 1){

            if(n%2 != 0){

                return false;

            }
            n = n/2;
        }

        return true;
    }

    public static boolean EffPower(int n){

        //Brian Kerningham algorithm
        if(n == 0){

            return false;

        }

        return (n & (n - 1)) == 0;

    }


}
