package easy.two_sum;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <a href="https://leetcode.com/problems/two-sum/">...</a>
 */
public class TwoSum {

    static int[] findTwoSumSquaredComplexity(int[] nums, int target){

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("The target cannot be reached");
    }
}

