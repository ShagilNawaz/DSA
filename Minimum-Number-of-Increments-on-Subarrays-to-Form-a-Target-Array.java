class Solution {
    public int minNumberOperations(int[] target) {
        int diff = 0;
        for(int i = 1; i < target.length; i++){
            if (target[i] > target[i-1]){
                diff += target[i] - target[i-1];
            }
        }
        return diff + target[0];
    }
}