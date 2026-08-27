class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> frequenciesS = new HashMap<>();
        Map<Character, Integer> frequenciesT = new HashMap<>();

        for (char c: s.toCharArray()) {
            frequenciesS.put(c, frequenciesS.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            frequenciesT.put(c, frequenciesT.getOrDefault(c, 0) + 1);
        }

        return frequenciesS.equals(frequenciesT);

    }
}
