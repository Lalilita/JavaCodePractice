package com.codePractice.logic1;

public class Logic2 {
    /*
    You are driving a little too fast, and a police officer stops you. Write code to compute the result,
    encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less,
    the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more,
    the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
    caughtSpeeding(60, false) → 0
    caughtSpeeding(65, false) → 1
    caughtSpeeding(65, true) → 0
     */
    public int caughtSpeeding(int speed, boolean isBirthday) {

        int result = 0;
        if (!isBirthday) {
            if (speed <= 60) {
                result = 0;
            } else if (speed <= 80) {
                result = 1;
            } else {
                result = 2;
            }
        } else {
            if (speed <= 60 + 5) {
                result = 0;
            } else if (speed <= 80 + 5) {
                result = 1;
            } else {
                result = 2;
            }
        }
        return result;
    }

    /*
    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
    so in that case just return 20.
    sortaSum(3, 4) → 7
    sortaSum(9, 4) → 20
    sortaSum(10, 11) → 21
     */
    public int sortaSum(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 19) {
            result = 20;
        }
        return result;
    }

    /*
    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating
    if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
    Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
    Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
    alarmClock(1, false) → "7:00"
    alarmClock(5, false) → "7:00"
    alarmClock(0, false) → "10:00"
     */
    public String alarmClock(int day, boolean vacation) {
        String ring = "";
        if (!vacation) {
            if (day >= 1 && day <= 5) {
                ring = "7:00";
            } else if (day == 0 || day == 6) {
                ring = "10:00";
            }
        } else {
            if (day >= 1 && day <= 5) {
                ring = "10:00";
            } else if (day == 0 || day == 6) {
                ring = "off";
            }
        }
        return ring;
    }
}
