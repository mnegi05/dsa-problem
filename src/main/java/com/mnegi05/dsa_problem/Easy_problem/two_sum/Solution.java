package com.mnegi05.dsa_problem.Easy_problem.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Step 1: Create a HashMap to store number and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Step 2: Loop through the array
        for (int i = 0; i < nums.length; i++) {

            // Step 3: Find the number needed to reach the target
            int needed = target - nums[i];

            // Step 4: Check if the needed number already exists in the map
            if (map.containsKey(needed)) {
                // Step 5: If found, return indices
                return new int[] { map.get(needed), i };
            }

            // Step 6: Otherwise, store current number and index
            map.put(nums[i], i);
        }

        // Step 7: This line will never be reached (guaranteed solution)
        return new int[] {};
    }
}