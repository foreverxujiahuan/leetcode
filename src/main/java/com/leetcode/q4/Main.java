package com.leetcode.q4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[2];
        int[] nums2 = new int[1];
        nums1[0] = 1;
        nums1[1] = 3;
        nums2[0] = 2;
        double res = findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m+n];
        System.arraycopy(nums1, 0, nums, 0, m);
        System.arraycopy(nums2, 0, nums, m, m + n - m);
        Arrays.sort(nums);
        if (nums.length%2==0) {
            return 1.0*(nums[nums.length/2]+nums[(nums.length/2)-1])/2;
        }else {
            return 1.0*nums[nums.length/2];
        }
    }
}
