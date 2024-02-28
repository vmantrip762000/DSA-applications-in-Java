import java.util.Arrays;

public class Varargs {

    static void fun1(int ...v){

        System.out.println(Arrays.toString(v));

    }

    static void fun2(int a, int b, String ...v){

        System.out.println(a +" "+ b + " " + Arrays.toString(v));
    }

    public static void main(String[] args){

        fun1(1,2,3,4,5,6,7);
        fun2(1,2,"abc", "def", "ghi");

    }
}
