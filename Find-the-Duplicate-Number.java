class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < n; i++){
            
            if (res.contains(nums[i])){
                return nums[i];
            }
            res.add(nums[i]);
        }
        return -1;
        
    }
}