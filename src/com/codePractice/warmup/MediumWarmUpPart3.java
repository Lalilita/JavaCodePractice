package com.codePractice.warmup;

public class MediumWarmUpPart3 {
    /*
    Given a string, return the count of the number of times that a substring length 2 appears in the string
    and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring)
    last2("hixxhi") → 1
    last2("xaxxaxaxx") → 1
    last2("axxxaaxx") → 2
     */
    public int last2(String str) {
        int count = 0;

        if (str.length() < 3) {
            return 0;
        } else {
            String last2Char = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(last2Char)) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
    Given an array of ints, return the number of 9's in the array.
    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public int arrayCount9(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.
    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false
     */
    public boolean arrayFront9(int[] nums) {
        int length = nums.length;
        boolean result = false;

        if (length > 4) {
            length = 4;
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] == 9) {
                result = true;
            }
        }
        return result;
    }

}
