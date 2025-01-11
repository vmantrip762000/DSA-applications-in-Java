public class ProductDigits {

    public static void main(String[] args) {

        int opVal = prodCalc(1342);
        System.out.println(opVal);

    }

    static int prodCalc(int n){

        if(n/10 == 0){

            return n;

        }

        return (n%10) * prodCalc(n/10);

    }
}
