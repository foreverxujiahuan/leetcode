package com.leetcode.q7;

public class Main {
    public static void main(String[] args) {
        int n = 1534236469;
        int res = reverse(n);
        System.out.println(res);
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
            stringBuilder.append(s.charAt(i));
        }
        if (x<0) {
            try {
                return -Integer.parseInt(stringBuilder.substring(0,stringBuilder.length()-1));
            } catch (NumberFormatException e) {
                return 0;
            }

        }
        try {
            return Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
