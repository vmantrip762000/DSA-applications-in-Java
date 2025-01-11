public class sumOfDigits {

    public static void main(String[] args) {

        int opVal = sumCal(1342);
        System.out.println(opVal);

    }

    static int sumCal(int n){

        if(n == 0){

            return 0;

        }

        return (n%10) + sumCal(n/10);

    }
}
