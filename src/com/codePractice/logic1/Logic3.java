package com.codePractice.logic1;

public class Logic3 {
    /*
    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
    Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value
    of a number.
    love6(6, 4) → true
    love6(4, 5) → false
    love6(1, 5) → true
     */
    public boolean love6(int a, int b) {
        return (a == 6 || b == 6) || (a + b == 6) || (Math.abs(a - b) == 6);
    }

    /*
    Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true,
    in which case return true if the number is less or equal to 1, or greater or equal to 10.
    in1To10(5, false) → true
    in1To10(11, false) → false
    in1To10(11, true) → true
     */
    public boolean in1To10(int n, boolean outsideMode) {
        boolean result = false;

        if (!outsideMode && (n >= 1 && n <= 10)) {
            result = true;
        } else if (outsideMode && (n <= 1 || n >= 10)) {
            result = true;
        }
        return result;
    }

    /*
    We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
    Return true if the given non-negative number is special. Use the % "mod" operator
    specialEleven(22) → true
    specialEleven(23) → true
    specialEleven(24) → false
     */
    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }
}
