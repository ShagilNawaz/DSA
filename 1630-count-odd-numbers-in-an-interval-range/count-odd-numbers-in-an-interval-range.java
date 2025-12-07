class Solution {
    public int countOdds(int low, int high) {
        int ans = 1;
        int diff = high - low;
        if (low % 2 == 0 && high % 2 == 0){
            ans = (diff) / 2;
        }
        else {
            ans = (diff / 2) + 1;
        }
        return ans;
    }
}