package com.example.demo.nowcoder;

/**
 * @author qp
 * 旋转数组最小的数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
   输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
   例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
   NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Solution6 {
    public static void main(String[] args) {

    }
    public int minNumberInRotateArray(int [] array) {
        if (array.length==0) {
            return 0;
        }
       // {3,4,5,1,2}
        int l=0;
        int r=array.length-1;
        while (l<r) {
            int mid=(l+r)>>1;
            if (array[mid]>array[r]) {
                // [3,4,5,6,0,1,2]
                l=mid+1;
            }else if (array[mid]==array[r]) {
                // [1,0,1,1,1]
                r=r-1;
            }else {
                //[2,2,3,4,5,6,6]
                r=mid;
            }
        }
        return array[l];


    }
}
