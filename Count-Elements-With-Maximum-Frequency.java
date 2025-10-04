class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int maxFreq = 0;
        // Step 1: Find maximum frequency
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxFreq) {
                maxFreq = count;
            }
        }
        // Step 2: Sum max frequencies for all elements with maxFreq
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == maxFreq) {
                sum += maxFreq; // add maxFreq for each occurrence
            }
        }
        // Step 3: Divide by max frequency
        return sum / maxFreq;
    
    }
}