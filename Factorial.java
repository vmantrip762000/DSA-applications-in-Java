public class Factorial {

    public static void main(String[] args) {

        int opVal = factorial(5);
        System.out.println(opVal);

    }

    static int factorial(int n){

        if(n <= 1){

            return 1;

        }
        return n * factorial(n - 1);

    }
}
