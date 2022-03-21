package com.codePractice;

public class Main {

    public static void main(String[] args) {


    }

    /*

    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday, or we're on vacation. Return true if we sleep in.
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation;

    }

    /*
    Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
     */

    public int diff21(int n) {

        if(n <= 21){
            return 21 - n;
        }else{
            return (n - 21)*2;
        }
    }

    /*
    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false
     */
    public boolean parrotTrouble(boolean talking, int hour) {

        return talking && (hour < 7 || hour > 20);

    }

    /*
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true
    */
    public boolean makes10(int a, int b) {

        return (a == 10 || b == 10 || a+b == 10);

    }

    /*
    Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.
    nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false
     */
    public boolean nearHundred(int n) {

        return (Math.abs(100 - n) <= 10  || Math.abs(200 - n) <= 10);
    }


}
