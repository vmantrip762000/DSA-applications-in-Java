import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        String myWord = "Aditya Mantripragada Hello World";
        System.out.println(myWord.toLowerCase());
        System.out.println(myWord.charAt(3));
        System.out.println(myWord.indexOf('a'));
        System.out.println("   Aditya   ");
        System.out.println("    Aditya   ".strip());
        System.out.println(Arrays.toString(myWord.toCharArray()));

    }
}
