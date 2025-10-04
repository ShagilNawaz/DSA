class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            digits[i] = s.charAt(i) - '0';
        }
        for (int j = 0; j < digits.length; j++){
            if (digits[j] == 6){
                digits[j] = 9;
                break;
            }
        }
        int ans = 0;
        for (int digit : digits) {
            ans = ans * 10 + digit;
        }
        return ans; 
    }
}