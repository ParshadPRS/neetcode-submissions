class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int lowestTillNow = prices[0];
        int maxPossibleProfit = 0;

        for (int i=0 ; i<n ; i++) {
            int todayPrice = prices[i];

            if (todayPrice < lowestTillNow) {
                lowestTillNow = todayPrice;
            }
            else if (todayPrice > lowestTillNow) {
                int currentProfit = todayPrice - lowestTillNow;
                maxPossibleProfit = Math.max(currentProfit, maxPossibleProfit);
            }
        }

        return maxPossibleProfit;
    }
}
