package com.leetcode.q17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String digits = "23";
        List<String> res = letterCombinations(digits);
        System.out.println(res);
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<String>();
        }
        HashMap<Character, String> hashMap = new HashMap<Character, String>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");
        List<String> res = new ArrayList<String>();
        StringBuilder cur = new StringBuilder("");
        dfs(digits, cur, 0, hashMap, res);
        return res;
    }

    private static void dfs(String digits, StringBuilder cur, int index, HashMap<Character, String> hashMap, List<String> res) {
        if (cur.length() == digits.length()) {
            res.add(cur.toString());
            return;
        }
        for (int i=0;i<hashMap.get(digits.charAt(index)).length();i++) {
            cur.append(hashMap.get(digits.charAt(index)).charAt(i));
            dfs(digits, cur, index+1, hashMap, res);
            cur.delete(index, index+1);
        }
    }
}
