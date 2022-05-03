package com.codePractice.logic1;

public class Logic5 {
    /*
    iven a non-negative number "num", return true if num is within 2 of a multiple of 10.
    nearTen(12) → true
    nearTen(17) → false
    nearTen(19) → true
     */
    public boolean nearTen(int num) {
        if (num % 10 <= 2) {
            return true;
        } else return num % 10 == 8 || num % 10 == 9;
    }

    /*
    Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive,
    are extra lucky. So if either value is a teen, just return 19.
    teenSum(3, 4) → 7
    teenSum(10, 13) → 19
    teenSum(13, 2) → 19
     */
    public int teenSum(int a, int b) {
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
            return 19;
        } else return a+b;
    }

    /*
    Your cell phone rings. Return true if you should answer it. Normally you answer,
    except in the morning you only answer if it is your mom calling. In all cases,
    if you are asleep, you do not answer.
    answerCell(false, false, false) → true
    answerCell(false, false, true) → false
    answerCell(true, false, false) → false
     */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if(isAsleep) {
            return false;
        }
        if(isMorning && !isMom) {
            return false;
        }
        return true;
    }

}



