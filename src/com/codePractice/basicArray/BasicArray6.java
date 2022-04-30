package com.codePractice.basicArray;

public class BasicArray6 {
    /*
    Given an array of ints of even length, return a new array length 2 containing the middle two elements
    from the original array. The original array will be length 2 or more.
    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2]
     */
    public int[] makeMiddle(int[] nums) {
        int[] arr = new int[2];
        arr[0] = nums[(nums.length / 2) - 1];
        arr[1] = nums[nums.length / 2];
        return arr;
    }

    /*
    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
     */
    public int[] plusTwo(int[] a, int[] b) {
        int[] arr = new int[4];
        arr[0] = a[0];
        arr[1] = a[1];
        arr[2] = b[0];
        arr[3] = b[1];
        return arr;
    }

    /*
    Given an array of ints, swap the first and last elements in the array.
    Return the modified array. The array length will be at least 1.
    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    swapEnds([1, 2, 3]) → [3, 2, 1]
    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
     */
    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

}
