package com.example.demo.nowcoder;

/**
 * @author qp
 * 替换空格  请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution2 {
    public static void main(String[] args) {

    }

    public String replaceSpace(StringBuffer str) {
        StringBuilder res=new StringBuilder();
        String tem=str.toString();
        int length=tem.length();
        if (length==0) {
            return res.toString();
        }
        for (int i=0 ;i<tem.length();i++) {
            if (tem.charAt(i)==32) {
                res.append("%20");
            }else {
                res.append(tem.charAt(i));
            }
        }
        return res.toString();
    }
}
