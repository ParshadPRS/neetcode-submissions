class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberToIndex = new HashMap<Integer, Integer>();
        int n = nums.length;

        for (int i=0 ; i<n ; i++) {
            if (numberToIndex.containsKey(target - nums[i])) {
                int index = numberToIndex.get(target - nums[i]);
                return new int[] { index , i };
            }
            numberToIndex.put(nums[i] , i);
        }
        
        return new int[] { -1 , -1 };
    }
}
