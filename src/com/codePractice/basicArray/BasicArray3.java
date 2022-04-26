package com.codePractice.basicArray;

public class BasicArray3 {
    /*
    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     */
    public int[] middleWay(int[] a, int[] b) {
        int[] output = new int[2];
        output[0] = a[1];
        output[1] = b[1];
        return output;
    }

    /*
    Given an array of ints, return a new array length 2 containing the first and last elements from
    the original array. The original array will be length 1 or more.
    makeEnds([1, 2, 3]) → [1, 3]
    makeEnds([1, 2, 3, 4]) → [1, 4]
    makeEnds([7, 4, 6, 2]) → [7, 2]
     */
    public int[] makeEnds(int[] nums) {
        int[] output = new int[2];
        output[0] = nums[0];
        output[1] = nums[nums.length-1];
        return output;
    }

    /*
    Given an int array length 2, return true if it contains a 2 or a 3.
    has23([2, 5]) → true
    has23([4, 3]) → true
    has23([4, 5]) → false
     */
    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3);
    }
}
