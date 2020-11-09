package com.leetcode.contest;

public class A {
    public static void main(String[] args) {
        int n = 0;
        int res = getMaximumGenerated(n);
        System.out.println(res);
    }

    public static int getMaximumGenerated(int n) {
        if (n==0) {
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int max = 0;
        int[] nums = new int[n+1];
        nums[0] = 1;
        nums[1] = 1;
        for(int i=2;i<=n;i++) {
            if (i%2==0) {
                nums[i] = nums[i/2];
            } else {
                nums[i] = nums[i/2] + nums[1+(i/2)];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
