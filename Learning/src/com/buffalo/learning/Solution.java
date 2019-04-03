package com.buffalo.learning;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSumHashTable(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int result = target-nums[i];
            if(map.containsKey(result)&& map.get(result)!=i){
                return new int[]{i,map.get(result)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public int[] twoSumBruteForce(int[] nums, int target) {
        int i=0,j=0;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}