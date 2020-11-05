package com.leetcode.q1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] nums = {3,2,4};
        int target = 6;
        int[] res = twoSum(nums, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], i);
        }
        for (int i=0;i<nums.length;i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp) && i!=map.get(tmp)) {
                return new int[]{i, map.get(tmp)};
            }
        }
        return new int[] {};
    }
}
