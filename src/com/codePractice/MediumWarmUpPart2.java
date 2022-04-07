package com.codePractice;

public class MediumWarmUpPart2 {
        /*
        Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        doubleX("axxbb") → true
        doubleX("axaxax") → false
        doubleX("xxxxx") → true
        */
        boolean doubleX(String str) {
            boolean result = false;

            if(str.indexOf("x") == -1){
                result = false;
            }else if(str.indexOf("x") != -1){
                int i = str.indexOf("x");
                String haveX = str.substring(i);
                result = haveX.startsWith("xx");
            }
            return result;

        }

        /*
        Given a string, return a new string made of every other char starting with the first,
        so "Hello" yields "Hlo".
        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"
         */
        public String stringBits(String str) {
            String newStr = "";

            for(int i =0; i < str.length() ; i+=2){
                newStr += str.charAt(i);    //or newStr+=str.substring(i, i+1);
            }
            return newStr;
        }

        /*
        Given a non-empty string like "Code" return a string like "CCoCodCode".
        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"
         */
        public String stringSplosion(String str) {
            String newStr = "";

            for(int i = 0; i < str.length(); i++){
                newStr += str.substring(0,i+1);
            }
            return newStr;
        }



}
