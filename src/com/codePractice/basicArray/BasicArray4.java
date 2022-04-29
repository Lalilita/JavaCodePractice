package com.codePractice.basicArray;

public class BasicArray4 {

    /*
    Given an int array length 2, return true if it does not contain a 2 or 3.
    no23([4, 5]) → true
    no23([4, 2]) → false
    no23([3, 5]) → false
     */
    public boolean no23(int[] nums) {
        return (nums[0] != 2 && nums[0] != 3) && (nums[1] != 2 && nums[1] != 3);
    }

    /*
    Given an int array, return a new array with double the length where its last element is
    the same as the original array, and all the other elements are 0.
    The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3]
     */
    public int[] makeLast(int[] nums) {
        int[] arr = new int[(nums.length) * 2];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

    /*
    Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.
    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false
     */
    public boolean double23(int[] nums) {
        boolean result = false;
        if(nums.length == 2){
            if(nums[0] == 2 && nums[nums.length-1] == 2){
                result = true;
            }else if(nums[0] == 3 && nums[nums.length-1] == 3){
                result = true;
            }
        }
        return result;
    }
}
