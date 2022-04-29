package com.codePractice.map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    /*
    The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
    with a key for each different string, with the value the number of times that string appears in the array.
    wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
    wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < strings.length; i++){
            if(!map.containsKey(strings[i])){
                for(int j = i; j < strings.length; j++){
                    if(strings[i].equals(strings[j])){
                        count++;
                    }
                }
                map.put(strings[i], count);
                count = 0;
            }
        }
        return map;
    }

    //another solution
    public Map<String, Integer> wordCount2(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for(String s: strings){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                count = map.get(s) + 1;
                map.put(s, count);
            }
        }
        return map;
    }

    /*
    Given an array of non-empty strings, return a Map<String, String> with a key for
    every different first character seen, with the value of all the strings starting
    with that character appended together in the order they appear in the array.
    firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
    firstChar([]) → {}
     */
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        String word = "";
        for(int i =0; i < strings.length; i++){
            if(!map.containsKey(strings[i].substring(0,1))){
                for(int j =i; j < strings.length; j++){
                    if((strings[i].substring(0,1)).equals(strings[j].substring(0,1))){
                        word += strings[j];
                    }
                }
                map.put(strings[i].substring(0,1), word);
                word = "";
            }
        }
        return map;
    }

    /*
    Given an array of strings, return a Map<String, Boolean> where each different string is a key and
    its value is true if that string appears 2 or more times in the array.
    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        int count =0;

        for(int i =0; i < strings.length; i++){
            if(!map.containsKey(strings[i])){
                for(int j = i; j <strings.length; j++){
                    if(strings[i].equals(strings[j])){
                        count++;
                    }
                    if(count > 1){
                        map.put(strings[i], true);
                        break;
                    }else{
                        map.put(strings[i], false);
                    }
                }
                count = 0;
            }
        }
        return map;
    }

    //another solution
    public Map<String, Boolean> wordMultiple2(String[] strings) {
        Map<String, Boolean> map = new HashMap();
        for (String s:strings) {
            // plan for stored boolean:
            //   false = seen it once
            //   true = seen it twice or more
            if (!map.containsKey(s)) {
                map.put(s, false);
            }
            else if (map.get(s) == false) {  // works without this test
                map.put(s, true);
            }
        }
        return map;
    }


}
