package com.codePractice;

public class StringPart3 {
    /*
    Given a string, return a string length 1 from its front, unless front is false,
    in which case return a string length 1 from its back. The string will be non-empty.
    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"
     */
    public String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    /*
    Given a string, return a version without both the first and last char of the string.
    The string may be any length, including 0.
    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""
     */
    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    /*
    Given a string of even length, return a string made of the middle two chars,
    so the string "string" yields "ri". The string length will be at least 2.
    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"
     */
    public String middleTwo(String str) {
        int midLen = str.length() / 2;
        return str.substring(midLen - 1, midLen + 1);
    }

    /*
    Given a string, return true if it ends in "ly".
    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
     */
    public boolean endsLy(String str) {
        return (str.length() >= 2) && (str.substring(str.length() - 2).equals("ly"));
    }

    /*
    Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
     */
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length()-n);
    }

    /*
    Given a string and an index, return a string length 2 starting at the given index.
    If the index is too big or too small to define a string length 2, use the first 2 chars.
    The string length will be at least 2.
    twoChar("java", 0) → "ja"
    twoChar("java", 2) → "va"
    twoChar("java", 3) → "ja"
     */
    public String twoChar(String str, int index) {
        if(index >= str.length()-1 || index < 0){
            return str.substring(0,2);
        }else{
            return str.substring(index, index+2);
        }
    }

}
