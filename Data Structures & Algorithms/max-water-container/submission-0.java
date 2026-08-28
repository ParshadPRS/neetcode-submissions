class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int left = 0;
        int right = n-1;

        int maxArea = -1;

        while (left < right) {
            int currentArea = (right-left) * Math.min(heights[right], heights[left]);

            maxArea = Math.max(currentArea, maxArea);

            if (heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return maxArea;
    }
}
