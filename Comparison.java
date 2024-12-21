public class Comparison {

    public static void main(String[] args) {

        String a = "Aditya";
        String b = "Aditya";
        String c = a;

        System.out.println(a==b);// Both value and reference are checked
        System.out.println(b==c);// Both value and reference are checked
        System.out.println(c==a);// Both value and reference are checked

        //Hw to creeate 2 diff different objects of same value? Look below!

        String newA = new String("Aditya");
        String newB = new String("Aditya");
        System.out.println(newA.equals(newB));//only value is checked
        System.out.println(newA == newB);// Both value and reference are checked

        //Printing characters from a string

        String myName = new String("Aditya");
        System.out.println("The first letter in my name "+ myName + " is " + myName.charAt(0));


    }
}
