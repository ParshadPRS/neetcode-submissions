class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for(int num: nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b) -> Integer.compare(frequencies.get(b), frequencies.get(a))
        );

        for (int num: frequencies.keySet()) {
            heap.offer(num);
        }

        int[] answer = new int[k];

        while (k>0) {
            answer[k-1] = heap.poll();
            k--;
        }

        return answer;
    }
}
