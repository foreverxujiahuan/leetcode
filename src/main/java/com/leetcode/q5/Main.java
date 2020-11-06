package com.leetcode.q5;

public class Main {
    public static void main(String[] args) {
        String s = "abb";
        String res = longestPalindrome(s);
        System.out.println(res);
    }
    public static String longestPalindrome(String s) {
        int length = s.length();
        String res = "";
        for(int i=0;i<length;i++){
            for (int j=0;j<i+1;j++) {
                String substring = s.substring(j, j+length-i);
                if (isPalindrome(substring)) {
                    return substring;
                }
            }
        }
        return res;
    }

    private static boolean isPalindrome(String s){
        int length = s.length();
        if (length == 1) {
            return true;
        }
        int index1 = 0;
        int index2 = length-1;
        if (length%2!=0) {
            while (index1!=index2){
                if (s.charAt(index1)!=s.charAt(index2)) {
                    return false;
                }
                index1 = index1+1;
                index2 = index2-1;
            }
        }else {
            while (index1<index2){
                if (s.charAt(index1)!=s.charAt(index2)) {
                    return false;
                }
                index1 = index1+1;
                index2 = index2-1;
            }
        }

        return true;
    }
}
