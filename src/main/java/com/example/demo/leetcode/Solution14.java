package com.example.demo.leetcode;


/**
 * @author qp
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
   如果不存在公共前缀，返回空字符串 ""。
   输入: ["flower","flow","flight"]
   输出: "fl"
   横向扫描
 */
public class Solution14 {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
         if (strs.length==0) {
             return "";
         }
        String res=strs[0];
         for (int j=1;j<strs.length;j++) {
            res=help(res,strs[j]);
            if (res.length()==0) {
                break;
            }
         }
        return res;
    }

    private String help(String res, String str) {
        int length=Math.min(res.length(),str.length());
        int index=0;
        while (index<length && res.charAt(index)==str.charAt(index)) {
            index++;
        }
        return res.substring(0,index);
    }
}
