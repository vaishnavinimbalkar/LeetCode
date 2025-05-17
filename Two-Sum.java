import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (complements.containsKey(nums[i])) {
                return new int[]{complements.get(nums[i]), i};
            }
            complements.put(target - nums[i], i);
        }
        return null;
    }
}
