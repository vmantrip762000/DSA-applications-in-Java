public class FindUnique {

    public static void main(String[] args) {

        int[] myArr= {1, 2, 5, 2, 4, 7, 1, 4, 5};
        int unqVal = unqCalc(myArr);
        System.out.println("The unique value is " + unqVal);

    }

    static int unqCalc(int[] arr){

        int retVal = 0;
        for(int i:arr){

            retVal ^= i;

        }

        return retVal;

    }

}
