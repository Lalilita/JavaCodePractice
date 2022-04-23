package com.codePractice.string;

public class StringPart6 {
    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths, omit chars from the longer string
    so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
    The strings may be any length.
    minCat("Hello", "Hi") → "loHi"
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"
     */
    public String minCat(String a, String b) {
        String longStr = a;
        String shortStr = b;

        if (b.length() > a.length()) {
            longStr = b;
            shortStr = a;
            return shortStr + (longStr.substring(longStr.length() - shortStr.length()));
        }
        return (longStr.substring(longStr.length() - shortStr.length())) + shortStr;
    }

    /*/
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.
    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"
     */
    public String extraFront(String str) {
        if (str.length() <= 1) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    /*
    Given a string, if a length 2 substring appears at both its beginning and end,
    return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
    The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
    without2("HelloHe") → "lloHe"
    without2("HelloHi") → "HelloHi"
    without2("Hi") → ""
     */
    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.length() == 2) {
            return "";
        } else {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
                return str.substring(2);
            } else {
                return str;
            }
        }
    }

    /*
    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
    and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"
    */
    public String deFront(String str) {
        String start = "";
        String result = "";

        if(str.length() < 2){
            result = "";
        }else{
            String last2 = str.substring(2);
            if(str.startsWith("a")){
                start += "a";
            }
            if(str.charAt(1) == 'b'){
                start += "b";
            }
            result = start + last2;
        }
        return result;
    }
}
