package com.leetcode.q22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        List<String> res = generateParenthesis(n);
        System.out.println(res);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        int left = 0;
        int right = 0;
        String cur = new String("");
        dfs(res, left, right, cur, n);
        return res;
    }

    private static void dfs(List<String> res, int left, int right, String cur, int n) {
        if (right == n) {
            res.add(cur);
            return;
        }
        if (left < n) {
            dfs(res, left+1, right, cur + "(", n);
        }
        if (left > right) {
            dfs(res, left, right+1, cur + ")", n);
        }
    }
}
