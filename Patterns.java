public class Patterns {

    public static void main(String[] args) {

        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);

        

    }

    static void pattern1(int n){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++){

                System.out.print("* ");

            }

            System.out.println();

        }

    }

    static void pattern2(int n){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                System.out.print("* ");

            }

            System.out.println();

        }

    }

    static void pattern3(int n){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(j + " ");

            }

            System.out.println();

        }

    }

    static void pattern4(int n){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n - i + 1; j++){

                System.out.print("* ");

            }

            System.out.println();

        }

    }

    static void pattern5(int n){

        for(int i = 1; i < 2*n; i++){

            int totalColsInRow = i > n ? 2*n - i - 1:i;

            for(int j = 1; j <= totalColsInRow; j++){

                System.out.print("* ");

            }

            System.out.println();

        }

    }

    static void pattern6(int n){

        for(int i = 1; i < 2*n; i++){

            int totalColsInRow = i > n ? 2*n - i - 1:i;

            int noOfSpaces = n - totalColsInRow;

            for(int s = 0; s < noOfSpaces; s++){

                System.out.print(" ");

            }

            for(int j = 1; j <= totalColsInRow; j++){

                System.out.print("* ");

            }

            for(int s = 0; s < noOfSpaces; s++){

                System.out.print(" ");

            }

            System.out.println();

        }

    }

    static void pattern7(int n){

        for(int row = 1; row <= n; row++){

            for(int space = 0; space < n - row; space++){

                System.out.print("  ");

            }

            for(int col = row; col > 0; col--){

                System.out.print( col + " ");

            }

            for(int col = 2; col <= row; col++){

                System.out.print(col + " ");

            }

            System.out.println();

        }

    }

    static void pattern8(int n){

        for(int row = 1; row < 2*n; row++){

            int c =  row > n ? 2*n - row:row;

            for(int space = 0; space < n - c; space++){

                System.out.print("  ");

            }

            for(int col = c; col > 0; col--){

                System.out.print( col + " ");

            }

            for(int col = 2; col <= c; col++){

                System.out.print(col + " ");

            }

            System.out.println();

        }

    }

}
