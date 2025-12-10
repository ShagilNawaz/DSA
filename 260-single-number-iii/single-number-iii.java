class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int[] ans = new int[2];
        int idx = 0;
        
        for (int i = 0; i < nums.length; ) {
            // If last element OR current != next → this is a single
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                ans[idx++] = nums[i];
                i++; // move by 1 because this number had no pair
            } else {
                i += 2; // skip the pair
            }
        }
        
        return ans;
    }
}
