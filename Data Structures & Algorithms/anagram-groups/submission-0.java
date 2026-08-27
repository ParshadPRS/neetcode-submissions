class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mappings = new HashMap<>();

        for (String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            if (!mappings.containsKey(sorted)) {
                mappings.put(sorted, new ArrayList<>());
            }
            mappings.get(sorted).add(s);
        }

        List<List<String>> answer = new ArrayList<>();
        for (List<String> value: mappings.values()) {
            answer.add(value);
        }

        return answer;
    }
}
