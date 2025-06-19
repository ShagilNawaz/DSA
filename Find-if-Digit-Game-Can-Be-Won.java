class Solution {
    public boolean canAliceWin(int[] nums) {
        int totalSum = 0;
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            totalSum += num;
            if (num <= 9) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }
        int aliceSingle = singleDigitSum;
        int bobSingle = totalSum - aliceSingle;
        if (aliceSingle > bobSingle) {
            return true;
        }
        int aliceDouble = doubleDigitSum;
        int bobDouble = totalSum - aliceDouble;
        if (aliceDouble > bobDouble) {
            return true;
        }
        return false;
    }
}
