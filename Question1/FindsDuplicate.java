//The problem asks you to check if a given array contains any duplicates. If any value appears at least twice in the array, return true; otherwise, return false.

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}