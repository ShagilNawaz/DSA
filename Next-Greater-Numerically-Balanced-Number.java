class Solution {

    static boolean isBalanced (int x){
        int[] arr = new int [10];
        String s = String.valueOf(x);

    for (int i =0; i < s.length(); i++){
        int d = s.charAt(i) - '0';
        arr[d]++;
    }
    for(int i = 0; i < s.length(); i++){
        int d = s.charAt(i) - '0';
        if (arr[d]!= d){
            return false;
        }
    }
        return true;
        
    }
    public int nextBeautifulNumber(int n) {
        int num = n+1;
        while(true){
            if (isBalanced(num)){
                return num;
            }
            num++;
        }
    }
}
