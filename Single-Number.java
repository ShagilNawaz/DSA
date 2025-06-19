class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Make sure mid is even
            if (mid % 2 == 1) {
                mid--;
            }
            
            // Check if this pair is valid
            if (nums[mid] == nums[mid + 1]) {
                // Pair is correct — single number is on the right
                low = mid + 2;
            } else {
                // Pair is broken — single number is on the left (including mid)
                high = mid;
            }
        }
        
        // low == high is the index of the single number
        return nums[low];
    }
}
