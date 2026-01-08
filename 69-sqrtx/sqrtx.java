class Solution {
    public int mySqrt(int x) {
        if (x==0 || x==1)return x;
        int s = 1, e = x,ans=0; 
        
        while(s <= e){ 
            int mid = s+(e-s)/2;
            long val = (long) mid * mid; 
            if (val == x){
                return mid;
            }
            if (val < x){
                ans = mid; 
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }      
}