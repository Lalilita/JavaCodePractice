package com.codePractice.string;

public class StringPart4 {
    /*
    Given a string of odd length, return the string length 3 from its middle,
    so "Candy" yields "and". The string length will be at least 3.
    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
     */

    public String middleThree(String str) {
        int midLen = str.length() / 2;
        if (str.length() > 3) {
            return str.substring(midLen - 1, midLen + 2);
        }
        return str;
    }

    /*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
    Note: use .equals() to compare 2 strings.
    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
     */
    public boolean hasBad(String str) {
        return str.contains("bad") && (str.substring(0, 3).equals("bad") ||
                str.substring(1, 4).equals("bad"));
    }

    /*
    Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.
    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
     */
    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    /*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"
     */
    public String lastChars(String a, String b) {
        String charA = (a.length() == 0) ? "@" : a.substring(0, 1);
        String charB = (b.length() == 0) ? "@" : b.substring(b.length() - 1);

        return charA + charB;
    }
}
