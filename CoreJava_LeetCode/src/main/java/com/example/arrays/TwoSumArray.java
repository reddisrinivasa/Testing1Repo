package com.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * */

public class TwoSumArray {
    public static void main(String args[]){
        // Input: nums = [2,7,11,15], target = 9
        /*
        in maths x+y = target
        if x = nums[index] = nums[0] = 2
           y is unknown  then find y from the nums array if not found then throw message
           target = 9;
           solution is nums[index]+y=target = 2+y=9 = y = 9-2 = y= 7
           here target=7.
           if we found y 7 then sum of index of x and y is target = 2+7=9

        * */
        //Test case1: Input: nums = [2,7,11,15], target = 9
        TwoSumArray twoSumArray = new TwoSumArray();
        int[] nums =  {2,7,11,15};
        int target = 18;
        int result[] = twoSumArray.twoSum(nums, target);
        if(result != null){
            System.out.println("Output :: "+ Arrays.toString(result));
        }

    }
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];
            int x = target - curr;
            if(map.containsKey(x)){
                System.out.println("map.get(x):"+map.get(x)+ ": i = "+i);
                return new int[] {map.get(x),i};
            }
            map.put(curr, i);
        }
        return null;
    }
}
