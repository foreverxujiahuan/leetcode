package com.leetcode.q3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()){
            return 0;
        }
        int max = 1;
        int index = 0;
        for(int i=1;i<s.length();i++) {
            String tmp = s.substring(index, i);
            if (tmp.contains(s.substring(i,i+1))) {
                if (tmp.length() > max) {
                    max = tmp.length();
                }
                index = index + tmp.indexOf(s.substring(i,i+1)) + 1;
            }else {
                if (tmp.length() >= max) {
                    max = tmp.length()+1;
                }
            }
        }
        return max;
    }
}
