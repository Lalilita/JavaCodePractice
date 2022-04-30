package com.codePractice.basicArray;

public class BasicArray7 {
    /*
    Given an array of ints of odd length, return a new array length 3 containing the elements
    from the middle of the array. The array length will be at least 3.
    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    midThree([1, 2, 3]) → [1, 2, 3]
     */
    public int[] midThree(int[] nums) {
        int[] arr = new int[3];
        if(nums.length > 3){
            arr[0] = nums[nums.length/2 -1];
            arr[1] = nums[nums.length/2];
            arr[2] = nums[nums.length/2 +1];
        }else{
            arr = nums;
        }
        return arr;
    }

    /*
    Given an array of ints of odd length, look at the first, last, and middle values in the array
    and return the largest. The array length will be a least 1.
    maxTriple([1, 2, 3]) → 3
    maxTriple([1, 5, 3]) → 5
    maxTriple([5, 2, 3]) → 5
     */
    public int maxTriple(int[] nums) {
        int max = nums[0];
        if(nums.length > 1){
            if(max < nums[nums.length/2]){
                max = nums[nums.length/2];
            }
            if(max < nums[nums.length-1]){
                max = nums[nums.length-1];
            }
        }
        return max;
    }

    /*
    Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.
    frontPiece([1, 2, 3]) → [1, 2]
    frontPiece([1, 2]) → [1, 2]
    frontPiece([1]) → [1]
     */
    public int[] frontPiece(int[] nums) {
        if(nums.length > 1){
            int[] arr = new int[2];
            arr[0] = nums[0];
            arr[1] = nums[1];
            return arr;
        }else{
            return nums;
        }
    }
}
