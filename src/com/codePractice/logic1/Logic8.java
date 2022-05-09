package com.codePractice.logic1;

public class Logic8 {
    /*
    Return the sum of two 6-sided dice rolls, each in the range 1..6.
    However, if noDoubles is true, if the two dice show the same value, increment one die to the next value,
    wrapping around to 1 if its value was 6.
    withoutDoubles(2, 3, true) → 5
    withoutDoubles(3, 3, true) → 7
    withoutDoubles(3, 3, false) → 6
     */
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (noDoubles) {
            if (die1 == die2 && !(die1 == 6)) {
                sum += 1;
            } else if (die1 == 6 && die2 == 6) {
                sum = 7;
            }
        }
        return sum;
    }

    /*
    Given two int values, return whichever value is larger. However if the two values have the same remainder
    when divided by 5, then the return the smaller value. However, in all cases, if the two values are
    the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
    maxMod5(2, 3) → 3
    maxMod5(6, 2) → 6
    maxMod5(3, 2) → 3
     */
    public int maxMod5(int a, int b) {
        int result = 0;
        if (a == b) {
            result = 0;
        } else {
            if (a % 5 == b % 5) {
                result = Math.min(a, b);
            } else {
                result = Math.max(a, b);
            }
        }
        return result;
    }

    /*
    You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
    If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5.
    Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
    redTicket(2, 2, 2) → 10
    redTicket(2, 2, 1) → 0
    redTicket(0, 0, 0) → 5
     */
    public int redTicket(int a, int b, int c) {
        int result = 0;

        if (a == 2 && b == 2 && c == 2) {
            result = 10;
        } else if (a == b && b == c) {
            result = 5;
        } else if (a != b && a != c) {
            result = 1;
        }
        return result;
    }


}
