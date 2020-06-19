package com.example.demo.leetcode;

/**
 * @author qp
 * 验证回文串
 * 双指针
 */
public class Solution125 {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String s) {
        if (s==null) {
            return true;
        }
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i=0;
        int j=actual.length()-1;
        while (i<j) {
            if (actual.charAt(i)!=actual.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
