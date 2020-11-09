package com.leetcode.q16;

import java.util.Arrays;

public class Main {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestValue = Integer.MAX_VALUE;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length - 1;
            while (left<right) {
                int tmp = nums[left] + nums[right] + nums[i];
                if (Math.abs(tmp - target) < closestValue) {
                    closestValue = Math.abs(tmp - target);
                    res = tmp;
                }
                if (tmp > target) {
                    right--;
                }
                if (tmp < target) {
                    left++;
                }
                if (tmp == target) {
                    return tmp;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,1,55};
        int target = 3;
        int res = threeSumClosest(nums, target);
        System.out.println(res);
    }
}
