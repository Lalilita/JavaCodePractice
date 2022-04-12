package com.codePractice;

public class MediumWarmUpPart4 {

    /*
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true
     */
    public boolean array123(int[] nums) {
        boolean result = false;

        if (nums.length >= 3) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    /*
    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"
     */
    public String stringX(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < str.length() - 1 && str.substring(i, i + 1).equals("x"))) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    /*
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
    */
    public String altPairs(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i += 4) {
            int endChar = i + 2;
            if (endChar > str.length()) {
                endChar = str.length();
            }
            newStr += str.substring(i, endChar);
        }
        return newStr;

    }

}
