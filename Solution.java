/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
Assume that each input would have exactly one solution.

Example:

Given nums = [2, 11, 13, 7], target = 9,

Because nums[0] + nums[3] = 2 + 7 = 9,
return [0, 3].
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      Map<Integer, Integer> complimentToIndexMap = new HashMap<Integer, Integer>();
      int[] toBeReturned = new int[2];
        for( int i = 0; i < nums.length; i++) {
            
            if(complimentToIndexMap.containsKey(nums[i])) {
                
                int firstIndex = complimentToIndexMap.get(nums[i]);
                int secondIndex = i;
                toBeReturned[0] = firstIndex;
                toBeReturned[1] = secondIndex;
                System.out.println(firstIndex);
                System.out.println(secondIndex);
                return toBeReturned;
                
            }
            else {
                
                complimentToIndexMap.put(target - nums[i], i);
                
            }
        }
        
        return toBeReturned;
    }
}
