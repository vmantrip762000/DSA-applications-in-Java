public class CountZeros {

    public static void main(String[] args) {

        int numZeros = countFunc(10503,0);
        System.out.println(numZeros);

    }

    static int countFunc(int n, int count){

        if(n/10 == 0){

            return count;

        }

        if(n%10 != 0){

            return countFunc(n/10, count);

        } else{

            return countFunc(n/10, count + 1);

        }


    }

}
