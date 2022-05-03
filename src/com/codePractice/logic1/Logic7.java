package com.codePractice.logic1;

public class Logic7 {
    /*
    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    twoAsOne(1, 2, 3) → true
    twoAsOne(3, 1, 2) → true
    twoAsOne(3, 2, 2) → false
     */
    public boolean twoAsOne(int a, int b, int c) {
        return a+b == c || b+c == a || a+c == b;
    }

    /*
    Given three ints, a b c, return true if b is greater than a, and c is greater than b.
    However, with the exception that if "bOk" is true, b does not need to be greater than a.
    inOrder(1, 2, 4, false) → true
    inOrder(1, 2, 1, false) → false
    inOrder(1, 1, 2, true) → true
     */
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (a < b && b < c) || ((b < c) && (bOk));
    }

    /*
    Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7,
    but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed,
    such as 5 5 7 or 5 5 5.
    inOrderEqual(2, 5, 11, false) → true
    inOrderEqual(5, 7, 6, false) → false
    inOrderEqual(5, 5, 7, true) → true
     */
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return (a < b && b< c) || (equalOk && (a <= b && a<= c && b<=c));
    }

    /*
    Given three ints, a b c, return true if two or more of them have the same rightmost digit.
    The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
    lastDigit(23, 19, 13) → true
    lastDigit(23, 19, 12) → false
    lastDigit(23, 19, 3) → true
     */
    public boolean lastDigit(int a, int b, int c) {
        return a%10 == b%10 || a%10 == c%10 || b%10 == c%10;
    }
}
