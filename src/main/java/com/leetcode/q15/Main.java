package com.leetcode.q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        System.out.println(threeSum(nums));
//        System.out.println(res);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0;i<length;i++) {
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i+1;
            int right = length-1;
            while (left<right) {
                int sum = nums[left] + nums[i] + nums[right];
                if (sum == 0){
                    List<Integer> tmp = new ArrayList<Integer>();
                    int[] t = {nums[i], nums[left], nums[right]};
                    Arrays.sort(t);
                    tmp.add(t[0]);
                    tmp.add(t[1]);
                    tmp.add(t[2]);
                    res.add(tmp);
                    while (nums[left] == nums[left+1] && left+1<right){
                        left++;
                    }
                    while (nums[right] == nums[right-1] && left<right-1){
                        right--;
                    }
                }
                if (sum > 0) {
                    right--;
                }else {
                    left++;
                }
            }
        }
        return res;
    }

}
