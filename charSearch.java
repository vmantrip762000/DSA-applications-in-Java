public class charSearch {

    /*
    You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
    There are at least two different characters in letters.
     */

    public static char findLetter(char[] letters, char target) {
        int s = 0, e = letters.length - 1, m = 0;
        while (s <= e) {

            m = (s + e) / 2;
            if (letters[m] > target) {

                e = m - 1;

            } else {

                s = m + 1;

            }

        }
        return letters[s % letters.length];
    }


}
