class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> freq1 = new HashMap<>();
        int n1 = s1.length();

        for (int i=0 ; i<n1 ; i++) {
            char c = s1.charAt(i);
            freq1.put(c, freq1.getOrDefault(c,0)+1);
        }

        int left = 0;

        Map<Character, Integer> freq2 = new HashMap<>();
        int n2 = s2.length();

        for (int right=0 ; right<n2 ; right++) {
            char rightChar = s2.charAt(right);
            freq2.put(rightChar, freq2.getOrDefault(rightChar,0)+1);

            if ((right-left+1) > n1) {
                char leftChar = s2.charAt(left);
                freq2.put(leftChar, freq2.get(leftChar)-1);

                if (freq2.get(leftChar) == 0) {
                    freq2.remove(leftChar);
                }

                left++;
            }

            if (right-left+1 == n1 && freq1.equals(freq2)) {
                return true;
            } 
        }

        return false;
    }
}
