class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> seen = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right=0 ; right<n ; right++) {
            char newChar = s.charAt(right);

            while(seen.contains(newChar)) {
                char leftChar = s.charAt(left);
                seen.remove(leftChar);
                left++;
            }

            seen.add(newChar);
            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;


    }
}
