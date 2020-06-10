package com.example.demo.leetcode;


/**
 * @author qp
 * 判断一个数是否为回文数
 * 输入: 121
   输出: true
 */
public class Solution9 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        // 1221
        boolean flag=false;
       String str=String.valueOf(x);
        int n=str.length();
        int i=0;
        int j=n-1;
        while (i<=j) {
            if (str.charAt(i)!=str.charAt(j)) {
                break;
            }else {
                i++;
                j--;
            }
        }
        if (i>j) {
            flag=true;
        }

        return flag;
    }

    public boolean isPalindrome2(int x) {
        if (x<0 || (x%10==0 && x!=0)) {
            return false;
        }
        int res=0;
        int tem=x;
        while (x>0) {
            res=res*10+x%10;
            x/=10;
        }
        // tem==res 偶数的情况  tem==res/10 奇数的情况 例如 12321
        return tem==res || tem==(res/10);
    }
}
