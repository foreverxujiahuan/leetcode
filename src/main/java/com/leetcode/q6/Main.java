package com.leetcode.q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "AB";
        int nums = 1;
        String res = convert(s, nums);
        System.out.println(res);
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[] strArray = new String[numRows];
        Arrays.fill(strArray, "");
        boolean goingDown = true;
        int index = 0;
        for (int i=0;i<s.length();i++) {
            if (goingDown) {
                strArray[index] = strArray[index] + s.charAt(i);
                index = index+1;
                if (index == numRows){
                    goingDown = false;
                    index = index - 1;
                }
            }else {
                index = index - 1;
                strArray[index] = strArray[index] + s.charAt(i);
                if (index == 0) {
                    goingDown = true;
                    index++;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<numRows;i++) {
            stringBuilder.append(strArray[i]);
        }
        return stringBuilder.toString();
    }
}
