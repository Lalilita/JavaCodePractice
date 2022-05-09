package com.codePractice.logic1;

public class Logic10 {
    /*
    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
    lessBy10(1, 7, 11) → true
    lessBy10(1, 7, 10) → false
    lessBy10(11, 1, 7) → true
     */
    public boolean lessBy10(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ac = Math.abs(a - c);
        return ab >= 10 || bc >= 10 || ac >= 10;
    }

    /*
    Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits
    as a. If the sum has more digits than a, just return a without b.
    sumLimit(2, 3) → 5
    sumLimit(8, 3) → 8
    sumLimit(8, 1) → 9
     */
    public int sumLimit(int a, int b) {
        int sum = a+b;
        int sumA = String.valueOf(a).length();
        int sumLen = String.valueOf(sum).length();
        return (sumLen > sumA)? a : sum;
    }
}
