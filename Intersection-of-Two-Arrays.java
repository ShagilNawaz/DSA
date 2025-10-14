class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int [] ans = new int [Math.min(n , m)];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if (nums1[i] == nums2[j]){
                if (k==0 || ans[k-1] != nums1[i]){
                ans[k++] = nums1[i];
                }
                i++;
                j++;
            }
            else if (nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}

