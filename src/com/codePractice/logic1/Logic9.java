package com.codePractice.logic1;

public class Logic9 {
    /*
    You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
    the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
    the result is 10.
    greenTicket(1, 2, 3) → 0
    greenTicket(2, 2, 2) → 20
    greenTicket(1, 1, 2) → 10
     */
    public int greenTicket(int a, int b, int c) {
        int result = 0;
        if (a != b && b != c && a != c) {
            result = 0;
        } else if (a == b && b == c) {
            result = 20;
        } else {
            result = 10;
        }
        return result;
    }

    /*
    You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs,
    which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair.
    If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10
    more than either bc or ac sums, the result is 5. Otherwise the result is 0.
    blueTicket(9, 1, 0) → 10
    blueTicket(9, 2, 0) → 0
    blueTicket(6, 1, 4) → 10
     */
    public int blueTicket(int a, int b, int c) {
        int result = 0;
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            result = 10;
        } else if (ab - bc == 10 || ab - ac == 10) {
            result = 5;
        }
        return result;
    }

    /*
    Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
    such as the 2 in 12 and 23.
    shareDigit(12, 23) → true
    shareDigit(12, 43) → false
    shareDigit(12, 44) → false
     */
    public boolean shareDigit(int a, int b) {
        int aR = a % 10;
        int aL = a / 10;
        int bR = b % 10;
        int bL = b / 10;
        return (aR == bR || aR == bL) || (aL == bR || aL == bL);
    }

}
