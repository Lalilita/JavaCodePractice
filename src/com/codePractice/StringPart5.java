package com.codePractice;

public class StringPart5 {

    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the concatenation creates a double-char, then omit one of the chars, so "abc"
    and "cat" yields "abcat".
    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
     */
    public String conCat(String a, String b) {

        if (a.isEmpty() || b.isEmpty()) {
            return a + b;
        } else if (!(a.isEmpty() || b.isEmpty()) &&
                (a.substring(a.length() - 1).equals(b.substring(0, 1)))) {
            return a + b.substring(1);
        }
        return a + b;
    }

    /*
    Given a string of any length, return a new string where the last 2 chars,
    if present, are swapped, so "coding" yields "codign".
    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"
     */
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String first = str.substring(str.length() - 2, str.length() - 1);
        String last = str.substring(str.length() - 1);

        if (str.length() == 2) {
            return last + first;
        } else {
            return str.substring(0, str.length() - 2) + last + first;
        }
    }

    /*
    Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.
    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
     */
    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    /*
    Given a string, return true if the first 2 chars in the string also appear at the end of the string,
    such as with "edited".
    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true
     */
    public boolean frontAgain(String str) {

        if (str.length() < 2) {
            return false;
        }

        String front = str.substring(0, 2);
        String back = str.substring(str.length()-2);
        return(front.equals(back));

    }

}
