public class PalindromeCheck {

    public static void main(String[] args) {

        String myWord = "Racecar";
        System.out.println(palinCheck(myWord));

    }

    static boolean palinCheck(String word){

        word = word.toLowerCase();


        for(int i = 0; i < word.length()/2; i++){

            char start = word.charAt(i);
            char end = word.charAt(word.length() - 1 - i);
            if(start != end){

                return false;

            }

        }

        return true;

    }

}
