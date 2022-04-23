package com.codePractice.warmup;

public class HardWarmUp {

    /*
    Given an array of ints, return true if it contains a 2, 7, 1
    pattern: a value, followed by the value plus 5, followed by the value minus 1.
    Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    has271([1, 2, 7, 1]) → true
    has271([1, 2, 8, 1]) → false
    has271([2, 7, 1]) → true
     */
    public boolean has271(int[] nums) {

        boolean result = false;

        for(int i = 0; i < nums.length-2; i++){
            if(nums[i+1] == (nums[i] + 5) &&
                    Math.abs(nums[i+2] - (nums[i]-1)) <= 2){
                result = true;
            }
        }
        return result;
    }

    /*
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0
     */
    public int stringMatch(String a, String b) {

        int count = 0;
        int shortLength = Math.min(a.length(), b.length());

        for(int i = 0 ; i < (shortLength - 1); i++){
            String subA = a.substring(i, i+2);
            String subB = b.substring(i, i+2);

            if(subA.equals(subB)){
                count++;
            }
        }
        return count;
    }
}
