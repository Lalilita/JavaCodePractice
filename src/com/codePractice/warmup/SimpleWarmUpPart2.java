package com.codePractice.warmup;

public class SimpleWarmUpPart2 {
    public static void main(String[] args) {
    }

    /*
    Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"
    */
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    //another solution
    public String notString1(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }

    /*
    Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"
     */
    public String missingChar(String str, int n) {
        return (str.substring(0, n) + str.substring(n + 1));
    }

    /*
    Given a string, return a new string where the first and last chars have been exchanged.
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */

    public String frontBack(String str) {
        String newStr = "";

        if (str.length() > 1) {
            newStr = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
            return newStr;

        } else {
            return str;

        }

    }

    //another solution
    public String frontBack1(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    /*
    Given a string, we'll say that the front is the first 3 chars of the string.
    If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
    front3("abc") → "abcabcabc"
     */
    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        return front + front + front;
    }

    /*
    Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt". The original string will be length 1 or more.
    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"
     */
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    /*
    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"
     */
    public String front22(String str) {
        int takeTwo = 2;

        if (takeTwo > str.length()) {
            takeTwo = str.length();
        }

        String front = str.substring(0, takeTwo);
        return front + str + front;

    }


}
