package com.codePractice;

public class StringPart2 {
    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
     */
    public String firstHalf(String str) {
        int firstHalf = str.length()/2;
        return str.substring(0, firstHalf);
    }

    /*
    Given a string, return a version without the first and last char, so "Hello" yields "ell".
    The string length will be at least 2.
    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"
     */
    public String withoutEnd(String str) {
        int end = str.length()-1;
        return str.substring(1,end);
    }

    /*
    Given 2 strings, a and b, return a string of the form short+long+short,
    with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).
    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"
     */
    public String comboString(String a, String b) {
        if(a.length() > b.length()){
            return b+a+b;
        }
        return a+b+a;
    }

    /*
    Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1.
    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
     */
    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }

    /*
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.
    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi"
     */
    public String left2(String str) {
        if(str.length() >= 3){
            return str.substring(2) + str.substring(0,2);
        }
        return str;
    }

    /*
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.
    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"
     */
    public String right2(String str) {

        String last2 = str.substring(str.length()-2);
        String first = str.substring(0, str.length()-2);

        if(str.length() <=2){
            return str;
        }else{
            return last2 + first;
        }
    }
}
