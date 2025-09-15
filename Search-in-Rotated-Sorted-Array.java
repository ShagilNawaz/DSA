class Solution {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;

            // Check if left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1; // Target is in left half
                } else {
                    low = mid + 1;  // Target is in right half
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;  // Target is in right half
                } else {
                    high = mid - 1; // Target is in left half
                }
            }
        }

        return -1; // Not found
    }
}

