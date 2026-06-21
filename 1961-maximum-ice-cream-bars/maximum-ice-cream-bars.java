class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;

        int ans = 0;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += costs[i];
            if (coins >= costs[i]){
                coins -= costs[i];
                ans++;
            }
        }
        return ans; 
    }
}