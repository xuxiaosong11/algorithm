package com.example.demo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qp
 * 无重复最长子串
 * 输入: "a b c a b c b b"
 *       i=0 j=0
   输出: 3
   解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class Solution3 {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) {
            return 0;
        }
        int res=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0,j=0;i<n;i++) {
            if (map.containsKey(s.charAt(i))) {
                j=Math.max(map.get(s.charAt(i))+1,j);
            }
            map.put(s.charAt(i),i);
            res=Math.max(res,i-j+1);
        }
        return res;
    }
}
