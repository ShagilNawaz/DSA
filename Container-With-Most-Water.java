class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max_water = 0;

        while (left < right){
            int breadth = right-left;
            int length =Math.min(height[left],height[right]);
            int current_water = length * breadth;
            max_water = Math.max(max_water,current_water);
            if (height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_water;
    }
    
}