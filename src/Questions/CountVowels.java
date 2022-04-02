package Questions;

import java.util.Arrays;

public class CountVowels {
    public static void main(String[] args) {

        /*Write Java Program to find the total number of vowels and consonants with pre-defined values
         *  'I love java'
         * */

        String text = "I love java";
        String vowels = "aeiouAEIOU";
        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                countVowels += 1;
            } else if (vowels.indexOf(text.charAt(i)) == -1 && text.charAt(i) != ' ') {
                countConsonants += 1;
            }
        }
        System.out.println("total number of vowels = " + countVowels);
        System.out.println("total number of consonants = " + countConsonants);


    }
}
