public class PatternReccPrint {

    public static void main(String[] args) {

        trinagle1(5, 0);
        System.out.println();
        System.out.println();
        trinagle2(4, 0);

    }

    static void trinagle1(int r, int c){

        if(r == 0){

            return;

        }
        if(c < r){

            trinagle1(r, c + 1);
            System.out.print("*");

        } else{

            trinagle1(r-1, 0);
            System.out.println();

        }

    }

    static void trinagle2(int r, int c){

        if(r == 0){

            return;

        }
        if(c < r){

            System.out.print("*");
            trinagle2(r, c + 1);


        } else{

            System.out.println();
            trinagle2(r-1, 0);

        }

    }
}
