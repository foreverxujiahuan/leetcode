package com.leetcode.q11;

public class Main {
    public static void main(String[] args) {
        int[] height = {1,1};
        int res = maxArea(height);
        System.out.println(res);
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        int tmp;
        while (left!=right) {
            if (height[left] < height[right]) {
                tmp = height[left] * (right - left);
                left++;
            }else {
                tmp = height[right] * (right - left);
                right--;
            }
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }
}
