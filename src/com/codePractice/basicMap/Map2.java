package com.codePractice.basicMap;

import java.util.Map;

public class Map2 {

    /*
    Given a map of food keys and topping values, modify and return the map as follows:
    if the key "ice cream" is present, set its value to "cherry". In all cases,
    set the key "bread" to have the value "butter".
    topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
    topping1({}) → {"bread": "butter"}
    topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }

    /*
    Given a map of food keys and their topping values, modify and return the map as follows:
    if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
    If the key "spinach" has a value, change that value to "nuts".
    topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
    topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
    topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
     */
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    /*
    Given a map of food keys and topping values, modify and return the map as follows:
    if the key "potato" has a value, set that as the value for the key "fries".
    If the key "salad" has a value, set that as the value for the key "spinach".
    topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
    topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
    topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
    */
    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

}
