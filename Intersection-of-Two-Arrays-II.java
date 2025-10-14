class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k =0;
        int [] res = new int [Math.min(n,m)];
        while(i < n && j < m){
            if (nums1[i] == nums2[j]){
                res[k++] = nums1[i];
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.copyOfRange(res,0,k);   
    }
}