package com.example.demo.nowcoder;

/**
 * @author
 * 二维数组的查找
 */
public class Solution1 {
    public static void main(String[] args) {

    }
    public boolean Find(int target, int [][] array) {
        int row=array.length-1;
        if (row==0) {
            return false;
        }
        int col=array[0].length-1;
        int j=0;
        boolean res=false;
        while (j<=col && row>=0) {
            if (array[row][j]>target) {
                row--;
            }else if (array[row][j]<target) {
                j++;
            }else {
                res=true;
                break;
            }
        }
        return res;
    }
}
