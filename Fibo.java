public class Fibo {

    public static void main(String[] args) {

        int myVal = fiboSeries(5);
        System.out.println(myVal);


    }

    static int fiboSeries(int n){

        if(n < 2){

            return n;

        }

        return fiboSeries(n - 1) + fiboSeries(n - 2);

    }
}
