package com.example.demo.leetcode;

import java.util.HashMap;

/**
 * @author qp
 * 两数之和
 */
public class Solution1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        if (length==0) {
            return new int[0];
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(target-nums[i])) {
                res[1] = i;
                res[0] = map.get(target - nums[i]);

            }else {
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
