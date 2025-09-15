class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        int s = search(arr, target, true);
        int e = search(arr, target, false);
        ans[0] = s;
        ans[1] = e;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return ans;
            }
        }
        return ans;
    }
    int search (int[] nums,int target,boolean findStartIndex){
        int ans = -1;
        int s = 0;
        int e = nums.length -1;
        while (s <= e){
            int mid = s + (e - s) / 2;
            if (target < nums[mid]){
                e = mid -1;

            }
            else if (target > nums[mid]){
                s = mid + 1;
            }
            else {
                ans = mid;
                if (findStartIndex == true){
                   e = mid - 1;
                }
                else {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
}