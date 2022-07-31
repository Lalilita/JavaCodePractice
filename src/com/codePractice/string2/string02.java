package com.codePractice.string2;

public class string02 {
    /*
    Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2
    */
    public int countCode(String str) {
        int count = 0;
        int indexOfCo = str.indexOf("co");

        for(int i = 0; i < str.length()-3; i++){
            if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e'){
                count++;
            }
        }
        return count;
    }

    /*
    Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true
    */
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    /*
    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true
    */
    public boolean xyzThere(String str) {
        if(str.contains("xyz") && str.contains(".")){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '.'){
                    if(str.substring(i+1).startsWith("xyz")){
                        i = i+3;
                    }
                }else if(str.charAt(i) == 'x'){
                    if(str.substring(i+1).startsWith("yz")){
                        return true;
                    }
                }
            }
        }else if(str.contains("xyz") && !str.contains(".")){
            return true;
        }
        return false;
    }
}
