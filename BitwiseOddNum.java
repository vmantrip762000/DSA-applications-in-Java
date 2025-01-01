public class BitwiseOddNum {

    public static void main(String[] args) {

        int myNum = 18;
        boolean outcome = oddCheck(myNum);
        if (outcome) {

            System.out.println("The number " + myNum + " is odd.");

        } else {

            System.out.println("The number " + myNum + " is even.");

        }


    }

    static boolean oddCheck(int n) {

        return (n & 1) == 1;

    }
}