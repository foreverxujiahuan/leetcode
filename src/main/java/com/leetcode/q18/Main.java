package com.leetcode.q18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,1,2,2};
        int target = 0;
        List<List<Integer>> res = fourSum(nums, target);
        System.out.println(res);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                int left = j+1;
                int right = nums.length - 1;
                while (left < right) {
                    int tmp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (tmp < target) {
                        left++;
                    }
                    if (tmp > target) {
                        right--;
                    }
                    if (tmp == target){
                        int[] t = {nums[i], nums[j], nums[left], nums[right]};
                        Arrays.sort(t);
                        List<Integer> integerList = new ArrayList<Integer>();
                        integerList.add(t[0]);
                        integerList.add(t[1]);
                        integerList.add(t[2]);
                        integerList.add(t[3]);
                        if (!res.contains(integerList)){
                            res.add(integerList);
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }

}
