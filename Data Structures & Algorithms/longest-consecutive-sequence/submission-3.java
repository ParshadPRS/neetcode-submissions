class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        int count = 1;
        int maxCount = 0;
        for (int num: set) {
            if (!set.contains(num-1)){
                int next = num+1;
                while(set.contains(next)) {
                    next = next+1;
                    count += 1;
                }
                maxCount = Math.max(count, maxCount);
                count = 1;
            }
        }

        return maxCount;
    }
}
