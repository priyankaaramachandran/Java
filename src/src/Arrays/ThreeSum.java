package Arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args){
        //Given an integer array nums,
        // return all the triplets [nums[i], nums[j], nums[k]]
        // such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
        //Notice that the solution set must not contain duplicate triplets.
        //Example 1:
        //Input: nums = [-1,0,1,2,-1,-4] ==> Output: [[-1,-1,2],[-1,0,1]]
        //Explanation:
        //nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
        //nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
        //nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
        //The distinct triplets are [-1,0,1] and [-1,-1,2].
        //Notice that the order of the output and the order of the triplets does not matter.
        int[] nums = new int[] {-1,0,1,2,-1,-4};
    //    threeSumBruteFroce(nums);
        System.out.println(threeSumBetterSolution(nums));
    }

    public static List<List<Integer>> threeSumBruteFroce(int[] nums){

        //to avoid duplicate triplets use set
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((i!=j) && (i!=k) && (j!=k)){
                        if((nums[i]+nums[j]+nums[k]) == 0){
                            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                            //sorting to avoid duplicates while inserting to the set
                            temp.sort(null);
                            st.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(st);
        return result;
    }

    public static List<List<Integer>> threeSumBetterSolution(int[] nums){

        Set<List<Integer>> st = new HashSet<>();

        for (int i =0;i<nums.length;i++){
            Set<Integer> hashSet = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                //Needed sum formula is nums[i] + nums[j] + nums[k] = 0
                //To avoid one loop for k, we derived the formula to find K (thirdSum)
                int thirdSum = -(nums[i] + nums[j]);
                if(hashSet.contains(thirdSum)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],thirdSum);
                    temp.sort(null);
                    st.add(temp);
                }
                hashSet.add(nums[j]);
            }
        }
        List<List<Integer>> result = new ArrayList<>(st);
        return result;
    }
}
