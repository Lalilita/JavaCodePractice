package com.codePractice.logic1;

public class Logic4 {
    /*
    Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    more20(20) → false
    more20(21) → true
    more20(22) → true
     */
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    /*
    Return true if the given non-negative number is a multiple of 3 or 5, but not both.
    Use the % "mod" operator
    old35(3) → true
    old35(10) → true
    old35(15) → false
     */
    public boolean old35(int n) {
        return !(n % 3 == 0 && n % 5 == 0) && (n % 3 == 0 || n % 5 == 0);
    }

    /*
    Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
    So for example 38 and 39 return true, but 40 returns false.
    less20(18) → true
    less20(19) → true
    less20(20) → false
     */
    public boolean less20(int n) {
        return Math.abs((n % 20) - 20) == 1 || Math.abs((n % 20) - 20) == 2;
    }
}
