package com.leetcode.q9;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        boolean res = isPalindrome(x);
        System.out.println(res);
    }

    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        return isPalindrome(String.valueOf(x));
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
