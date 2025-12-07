class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++){
            boolean isAns = true;
        
        for (int j = 0; j < n; j++){
            if (i != j && s.charAt(i) == s.charAt(j)){
                isAns = false;
                break;
            }
        }
        if (isAns){
            return i;
        }
    }
        return -1;
    }
}