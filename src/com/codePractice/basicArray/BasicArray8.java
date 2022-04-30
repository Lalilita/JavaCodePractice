package com.codePractice.basicArray;

public class BasicArray8 {
    /*
    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
    unlucky1([1, 3, 4, 5]) → true
    unlucky1([2, 1, 3, 4, 5]) → true
    unlucky1([1, 1, 1]) → false
     */
    public boolean unlucky1(int[] nums) {
        boolean unlucky = false;

        if (nums.length >= 2) {
            if (nums[0] == 1 && nums[1] == 3) {
                unlucky = true;
            } else if (nums[1] == 1 && nums[2] == 3) {
                unlucky = true;
            } else if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
                unlucky = true;
            }
        }
        return unlucky;
    }

    /*
    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
    the elements from a followed by the elements from b. The arrays may be any length, including 0,
    but there will be 2 or more elements available between the 2 arrays.
    make2([4, 5], [1, 2, 3]) → [4, 5]
    make2([4], [1, 2, 3]) → [4, 1]
    make2([], [1, 2]) → [1, 2]
     */
    public int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
        if (a.length >= 2) {
            arr[0] = a[0];
            arr[1] = a[1];
        } else if (a.length == 1) {
            arr[0] = a[0];
            arr[1] = b[0];
        } else {
            arr[0] = b[0];
            arr[1] = b[1];
        }
        return arr;
    }

    /*
    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
    If either array is length 0, ignore that array.
    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    front11([1], [2]) → [1, 2]
    front11([1, 7], []) → [1]
     */
    public int[] front11(int[] a, int[] b) {
        int[] arr;

        if (a.length > 0 && b.length > 0) {
            arr = new int[2];
            arr[0] = a[0];
            arr[1] = b[0];

        } else if (a.length == 0 && b.length > 0) {
            arr = new int[1];
            arr[0] = b[0];

        } else if (b.length == 0 && a.length > 0) {
            arr = new int[1];
            arr[0] = a[0];

        } else {
            arr = new int[0];
        }
        return arr;
    }
}
