class Solution {
    static final int MOD = 1000000007;

    public int numOfWays(int n) {

        // Base case for first row
        long same = 6; // A B A type
        long diff = 6; // A B C type

        for (int i = 2; i <= n; i++) {
            long newSame = (same * 3 + diff * 2) % MOD;
            long newDiff = (same * 2 + diff * 2) % MOD;

            same = newSame;
            diff = newDiff;
        }

        return (int)((same + diff) % MOD);
        
    }
}