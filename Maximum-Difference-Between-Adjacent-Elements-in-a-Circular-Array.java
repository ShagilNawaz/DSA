class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        List<Integer> diffs = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(nums[i] - nums[i + 1]);
            diffs.add(diff);
        }

       
        diffs.add(Math.abs(nums[0] - nums[n - 1]));

        return Collections.max(diffs);
    }
}
