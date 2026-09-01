class MedianFinder {

    List<Integer> numbers;

    public MedianFinder() {
        numbers = new ArrayList<>();
    }
    
    public void addNum(int num) {
        numbers.add(num);
    }
    
    public double findMedian() {
        int n = numbers.size();
        double median = 0;

        Collections.sort(numbers);

        if (n % 2 == 0) {
            median = (numbers.get(n/2 - 1) + numbers.get(n/2)) / 2.0;
        } else {
            median = numbers.get(n/2);
        }

        return median;
    }
}
