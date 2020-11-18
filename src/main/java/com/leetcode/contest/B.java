package com.leetcode.contest;

import java.util.*;

public class B {
    public static void main(String[] args) {
        String s1 = "uau";
        String s2 = "ssx";
        System.out.println(closeStrings(s1, s2));
    }

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        HashMap<Character, Integer> hashMap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashMap2 = new HashMap<Character, Integer>();
        for (char c: char1){
            if (hashMap1.containsKey(c)) {
                hashMap1.put(c, hashMap1.get(c)+1);
            } else {
                hashMap1.put(c, 1);
            }
        }
        for (char c: char2) {
            if (hashMap2.containsKey(c)) {
                hashMap2.put(c, hashMap2.get(c) +1);
            } else {
                hashMap2.put(c, 1);
            }
        }
        int lenght1 = hashMap1.size();
        int length2 = hashMap2.size();
        if (lenght1 != length2) {
            return false;
        }
        int[] nums1 = new int[lenght1];
        int[] nums2 = new int[length2];
        int index1 = 0;
        int index2 = 0;
        for (char c: hashMap1.keySet()) {
            nums1[index1] = hashMap1.get(c);
            index1++;
        }
        for (char c: hashMap2.keySet()) {
            nums2[index2] = hashMap2.get(c);
            index2++;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i=0;i<nums1.length;i++) {
            if (nums1[i] != nums2[i]) {
                return false;
            }
        }
        return true;
    }
}
