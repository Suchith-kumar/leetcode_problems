//https://leetcode.com/problems/maximum-subarray/description/

//Problem



//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//Example:
//
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//Follow up:
//
//If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.



//Solution



class Solution {
    public int maxSubArray(int[] nums) {
        
    int max_so_far = nums[0];
    int curr_max = nums[0];
 
    for (int i = 1; i < nums.length; i++)
    {
           curr_max = Math.max(nums[i], curr_max + nums[i]);
        max_so_far = Math.max(max_so_far, curr_max);
    }
    return max_so_far;
    }
}