package com.codePractice.ap;

public class AP1 {
    /*
    Given an array of scores, return true if each score is equal or greater than the one before.
    The array will be length 2 or more.
    scoresIncreasing([1, 3, 4]) → true
    scoresIncreasing([1, 3, 2]) → false
    scoresIncreasing([1, 1, 4]) → true
     */
    public boolean scoresIncreasing(int[] scores) {
        boolean result = false;
        if(scores.length >=2){
            for(int i = 0; i < scores.length-1; i++){
                if(scores[i+1] >= scores[i]){
                    result = true;
                }else{
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
    /*
    Given an array of scores, return true if there are scores of 100 next to each other in the array.
    The array length will be at least 2.
    scores100([1, 100, 100]) → true
    scores100([1, 100, 99, 100]) → false
    scores100([100, 1, 100, 100]) → true
     */
    public boolean scores100(int[] scores) {
        boolean result = false;
        if(scores.length > 2){
            for(int i = 0; i < scores.length-1; i++){
                if(scores[i] == 100 && scores[i+1] == 100 ){
                    result = true;
                }
            }
        }
        return result;
    }

    /*
    Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores
    that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
    scoresClump([3, 4, 5]) → true
    scoresClump([3, 4, 6]) → false
    scoresClump([1, 3, 5, 5]) → true
     */
    public boolean scoresClump(int[] scores) {
        boolean result = false;
        if(scores.length >= 3){
            for(int i = 0; i < scores.length-2; i++){
                if((scores[i+2] - scores[i+1]) + (scores[i+1] - scores[i]) <=2 ){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

}
