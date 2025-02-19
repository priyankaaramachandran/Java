package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
public static void main(String[] args){
    //Given an array of integers nums and an integer target,
    // return indices of the two numbers such that they add up to target.
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    //You may assume that each input would have exactly one solution,
    // and you may not use the same element twice.

    int[] nums = {2,7,11,15};
    int target = 9;
  //System.out.println(Arrays.toString(twoSum(nums,target)));
    System.out.println(Arrays.toString(twoSumOptimized(nums,target)));

}

    /**
     * twoSum using Brute force approach
     * time complexity of O(n^2)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums,int target){
        int[] indices = new int[2];

    for(int i=0;i<nums.length;i++){
        for(int j=1;j<nums.length;j++){
            if(i != j){
                if(nums[i] + nums[j] == target ) {
                    indices = new int[]{i,j};

                }
            }

        }

    }
        return indices;
    }

    /**
     * twoSumOptimized method using HashMap
     * Time complexity: O(n)
     * Space complexity: O(n), since we are storing up to n elements in the hash map.
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumOptimized(int[] nums, int target) {
        // HashMap to store the numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                System.out.println("inside if i is "+ i +" "+map.get(complement));
                // If it exists, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // If not, add the current number and its index to the map
            map.put(nums[i], i);
            System.out.println("inside else i is "+ i +" "+map);
        }

        // Return an empty array if no solution is found (though the problem guarantees one solution)
        return new int[] {};
    }
}
