public class SB {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for(int j = 0; j < 26; j++){

            char ch = (char) ('a' + j);
            builder.append(ch);

        }

        System.out.println(builder.toString());

    }


}
