package Arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> memory = new HashMap<>(); // number -> index
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i]; // what we want
            if (memory.containsKey(need)) { // check if we saw it already
                return new int[]{memory.get(need), i}; // return indices
            }
            memory.put(nums[i], i); // store current number with index
        }
        return new int[]{}; // no pair found
    }
}
