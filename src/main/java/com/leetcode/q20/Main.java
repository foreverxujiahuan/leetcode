package com.leetcode.q20;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = ")(";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length()%2==1) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (Character character: s.toCharArray()){
            if (character == '[' || character == '(' || character == '{') {
                stack.add(character);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character tmp = stack.pop();
                if (character == ']') {
                    if (tmp != '[') {
                        return false;
                    }
                }
                if (character == ')') {
                    if (tmp != '(') {
                        return false;
                    }
                }
                if (character == '}') {
                    if (tmp != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
