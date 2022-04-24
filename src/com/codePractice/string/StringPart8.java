package com.codePractice.string;

public class StringPart8 {
    /*
    Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged.
    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"
     */
    public String withoutX(String str) {
        if (str.startsWith("x")) {
            str = str.substring(1);
        } else {
            str = str;
        }

        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;

    }

    //another solution
    public String noX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    /*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged. This is a little harder than it looks.
    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
     */
    public String withoutX2(String str) {

        if (str.length() <= 2) {
            str = str.replace("x", "");
        } else {
            String first2 = str.substring(0, 2);

            if (first2.contains("x")) {
                str = first2.replace("x", "") + str.substring(2);
            }
        }
        return str;
    }
}
