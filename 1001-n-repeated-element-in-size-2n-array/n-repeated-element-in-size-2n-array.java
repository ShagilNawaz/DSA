class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);

        int maxFreq = 1;
        int currFreq = 1;
        int result = nums[0];

        for (int i = 1; i<nums.length;i++){

            if (nums[i] == nums[i-1]){
                currFreq++;
            }
            else{
                currFreq = 1;
            }
            if (currFreq > maxFreq){
                maxFreq = currFreq;
                result = nums[i]; 
            }
        }
        return result;
    }
}