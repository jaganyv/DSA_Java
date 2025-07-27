package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;  // duplicate found
            }
            seen.add(num);
        }
        return false; // no duplicate
    }

}
