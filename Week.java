import java.util.Scanner;

public class Week {

    public static void main(String[] args){

        int weekNo;
        Scanner new1 = new Scanner(System.in);
        System.out.println("Enter number of the day in the week.");
        weekNo = new1.nextInt();
        System.out.println("You have entered " + weekNo);
        switch (weekNo){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
