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
}
