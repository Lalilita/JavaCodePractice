package com.codePractice.basicArray;

import java.util.Arrays;

public class BasicArray2 {

    /*
    Given an array of ints length 3, return a new array with the elements in reverse order,
    so {1, 2, 3} becomes {3, 2, 1}.
    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
     */
    public int[] reverse3(int[] nums) {
        int[] output = new int[nums.length];
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[count] = nums[i];
            count++;
        }
        return output;
    }

    /*
    Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    and set all the other elements to be that value. Return the changed array.
    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        Arrays.fill(nums, max);
        return nums;
    }

    /*
    Given an array of ints, return the sum of the first 2 elements in the array.
    If the array length is less than 2, just sum up the elements that exist,
    returning 0 if the array is length 0.
    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
     */
    public int sum2(int[] nums) {
        if (nums.length > 1) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }

}
