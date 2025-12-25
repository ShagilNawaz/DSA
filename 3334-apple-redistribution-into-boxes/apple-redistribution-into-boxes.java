class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appSum = 0;
        int n = apple.length;
        for (int i = 0; i < n; i++){
            appSum += apple[i];
        }
        int count = 0;
        int capSum = 0;
        int m = capacity.length;
        
        Arrays.sort(capacity);
        for (int j = m-1; j >= 0; j--){
            
            capSum += capacity[j];
            count++;
            if (capSum >= appSum){
                return count;
            }

        }
        return count;
       
    }
}