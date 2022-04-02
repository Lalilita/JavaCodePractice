package Questions;

import java.util.Arrays;

public class FindAndSumDigit {
    public static void main(String[] args) {

        /*
        Write a program to find out sum of all digit from a string.
        */
        /*
        1.create an int variable (int sum) to store sum of all digit
        2.loop to find the element which is digit
            2.1. convert the digit element to integer and add to sum
        3.print sum

        */

        String str = "123abc321";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                //or int num = Integer.parseInt(String.valueOf(str.charAt(i)));
                //sum += num;
            }
        }
        System.out.println("sum of 123321 = " +sum);

        //another solution
        sum = 0;

        String arr[] = str.split("");
//        System.out.println(Arrays.toString(arr)); // ==> [1, 2, 3, a, b, c, 3, 2, 1]
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(arr[i]);
            }
        }
        System.out.println(sum);


    }
}
