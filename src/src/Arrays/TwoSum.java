package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

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
    System.out.println(Arrays.toString(twoSum(nums,target)));

}
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
}
