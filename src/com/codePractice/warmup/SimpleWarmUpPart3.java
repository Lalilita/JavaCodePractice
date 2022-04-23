package com.codePractice.warmup;

public class SimpleWarmUpPart3 {
    public static void main(String[] args) {
    }

    /*
    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
    or35(3) → true
    or35(10) → true
    or35(8) → false
     */
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    /*
    Given a string, return true if the string starts with "hi" and false otherwise.
    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
     */

    public boolean startHi(String str) {

        if(str.startsWith("hi")){
            return true;
        }else{
            return false;
        }
    }

    /*
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
     */
    public boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 && temp2 >100) || (temp2 < 0 && temp1 >100)){
            return true;
        }else{
            return false;
        }
    }
    // another solution
    public boolean icyHot1(int temp1, int temp2) {

        return ((temp1 < 0 && temp2 >100) || (temp2 < 0 && temp1 >100));
    }

    /*
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    in1020(12, 99) → true
    in1020(21, 12) → true
    in1020(8, 99) → false
     */
    public boolean in1020(int a, int b) {
        return((a >= 10 && a<=20) || (b >= 10 && b <= 20));
    }

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
    return true if 1 or more of them are teen.
    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true
     */
    public boolean hasTeen(int a, int b, int c) {
    return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.
    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false
     */
    public boolean loneTeen(int a, int b) {
        return (a>=13 && a<=19) && (!(b>=13 && b<=19)) ||
                (!(a>=13 && a<=19)) && (b>=13 && b<=19);
    }
    //another solution
    public boolean loneTeen1(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    /*
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.
    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
     */
    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }
    /*
    Return true if the given string begins with "mix", except the 'm' can be anything,
    so "pix", "9ix" .. all count.
    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false
     */
    public boolean mixStart(String str) {

        if((str.length() >= 3) && (str.substring(1,3).equals("ix"))) {
            return true;
        }
        return false;
    }
    // another solution
    public boolean mixStart1(String str) {
        if (str.length() < 3) return false;

        String two = str.substring(1, 3);
        return(two.equals("ix"));
    }

    /*

    Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z',
    so "ozymandias" yields "oz".
    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"
     */
    public String startOz(String str) {
        String result ="";

        if(str.length() >= 1 && str.charAt(0) == 'o'){
            result = result + str.charAt(0);
        }
        if(str.length() >= 2 && str.charAt(1) == 'z'){
            result = result + str.charAt(1);
        }
        return result;
    }
}
