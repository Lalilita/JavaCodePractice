package com.codePractice.logic1;

public class Logic6 {

    /*
    We are having a party with amounts of tea and candy. Return the int outcome of the party
    encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5.
    However, if either tea or candy is at least double the amount of the other one, the party is great (2).
    However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
    teaParty(6, 8) → 1
    teaParty(3, 8) → 0
    teaParty(20, 6) → 2
     */
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= 5 && candy >= 5) {
            if ((tea / candy >= 2) || (candy / tea >= 2)) {
                return 2;
            }
        }
        return 1;
    }

    /*
    Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
    If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
    fizzString("fig") → "Fizz"
    fizzString("dib") → "Buzz"
    fizzString("fib") → "FizzBuzz"
     */
    public String fizzString(String str) {
        boolean fStart = str.startsWith("f");
        boolean bEnd = str.endsWith("b");

        if(fStart && bEnd) return "FizzBuzz";
        if(fStart) return "Fizz";
        if(bEnd) return "Buzz";
        return str;
    }

    /*
    Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
    Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is
    divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    fizzString2(1) → "1!"
    fizzString2(2) → "2!"
    fizzString2(3) → "Fizz!"
     */
    public String fizzString2(int n) {
        boolean div3 = n % 3 == 0;
        boolean div5 = n % 5 == 0;

        if(div3 && div5) return "FizzBuzz!";
        if(div3) return "Fizz!";
        if(div5) return "Buzz!";
        return n + "!";
    }
}
