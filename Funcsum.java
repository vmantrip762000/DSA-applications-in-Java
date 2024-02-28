import java.util.Scanner;

public class Funcsum {

    static void sum1(){

        int a, b, sum;
        Scanner new1 = new Scanner(System.in);
        System.out.println("Sum by method 1");
        System.out.println("Enter number 1");
        a = new1.nextInt();
        System.out.println("Enter number 2");
        b = new1.nextInt();
        System.out.println("Sum of " + a +" and " + b +" is " + (a+b));

    }

    static int sum2(){

        int a, b;
        Scanner new1 = new Scanner(System.in);
        System.out.println("Sum by method 2");
        System.out.println("Enter number 1");
        a = new1.nextInt();
        System.out.println("Enter number 2");
        b = new1.nextInt();
        return a+b;

    }

    static int sum3(int p, int q){

        return p+q;

    }

    public static void main(String[] args){

        int myAnswer1, myAnswer2, val1, val2;
        sum1();
        myAnswer1 = sum2();
        System.out.println("Sum calculated by method 2 is " + myAnswer1);

        Scanner new2 = new Scanner(System.in);
        System.out.println("Enter number 1");
        val1 = new2.nextInt();
        System.out.println("Enter number 2");
        val2 = new2.nextInt();
        myAnswer2 = sum3(val1,val2);
        System.out.println("Sum calculated by method 3 is " + myAnswer2);





    }
}
