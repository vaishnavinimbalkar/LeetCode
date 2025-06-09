class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;

        for (int num : nums) {
            left = Math.max(left, num); // minimum possible largest sum
            right += num;               // maximum possible largest sum
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {
                right = mid; // try smaller max sum
            } else {
                left = mid + 1; // try larger max sum
            }
        }

        return left;
    }

    // Helper function to check if we can split into k or fewer subarrays
    private boolean canSplit(int[] nums, int k, int maxAllowedSum) {
        int count = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxAllowedSum) {
                count++;            // start a new subarray
                currentSum = 0;
            }
            currentSum += num;
        }

        return count <= k;
    }
}
