public class PatternFinal {

    public static void main(String[] args) {

        patternFinal(4);

    }

    static void patternFinal(int n){

        int originalN = n - 1;

        for(int row = 0; row <= n; row++){

            for (int col = 0; col <= n; col++){

                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex+ " ");

            }
            System.out.println();

        }

    }
}
