class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int fixed = 0;

        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(nums);

        while(fixed < n-2) {
            if (fixed > 0 && nums[fixed] == nums[fixed - 1]) {
                fixed++;
                continue;
            }

            int remaining = 0 - nums[fixed];

            int left = fixed + 1;
            int right = n-1;

            while(left < right) {

                int currentSum = nums[left] + nums[right];
                if (currentSum == remaining) {
                    answer.add(List.of(nums[fixed], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if (currentSum < remaining) {
                    left++;
                }
                else {
                    right--;
                }
            }
            fixed++;
        }

        return answer;
    }
}
