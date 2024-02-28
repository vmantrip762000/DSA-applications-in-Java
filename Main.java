//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter fruit name below.");

        String fruit = new1.next();

        System.out.println("You have entered " + fruit);

        switch (fruit){

            case "Mango":
                System.out.println("King of fruits.");
            case "Apple":
                System.out.println("A sweet round fruit.");
            case "Orange":
                System.out.println("A sour round fruit.");
            default:
                System.out.println("Enter a valid fruit name.");

        }




    }
}