package com.codePractice;

public class SimpleWarmUpPart4 {
    public static void main(String[] args) {

    }

    /*
    Given three int values, a b c, return the largest.
    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3
     */
    public int intMax(int a, int b, int c) {
        int max = a;

        if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }
        return max;
    }

    /*
    Given 2 int values, return whichever value is nearest to the value 10,
    or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0
     */
    public int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);

        if(diffA < diffB){
            return a;
        }
        if(diffB < diffA){
            return b;
        }
        return 0;
    }

    /*
    Given 2 int values, return true if they are both in the range 30..40 inclusive,
    or they are both in the range 40..50 inclusive.
    in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true
     */
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        return a >= 40 && a <= 50 && b >= 40 && b <= 50;
    }

    /*
    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    or return 0 if neither is in that range.
    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11
     */
    public int max1020(int a, int b) {
        int i = 0;
        int j = 0;

        i = (a >= 10 && a <= 20)? a : 0;
        j = (b >= 10 && b <= 20)? b : 0;
        return Math.max(i,j);
    }

    /*
    Return true if the given string contains between 1 and 3 'e' chars.
    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
     */
    public boolean stringE(String str) {
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
            // alternately: str.substring(i, i+1).equals("e")
        }
        return (count >= 1 && count <= 3);
    }
    /*
    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
     */
    public boolean lastDigit(int a, int b) {
        return (a % 10 == b% 10);
    }
    /*
    Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI
     */
    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }

    /*
    Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
     */
    public String everyNth(String str, int n) {

        String word = "";

        for(int i = 0; i < str.length(); i+=n){
            word += str.charAt(i);
        }
        return word;
    }
}
