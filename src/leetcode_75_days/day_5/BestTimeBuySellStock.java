package leetcode_75_days.day_5;

public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {

        int minPriceBuy = 10000;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPriceBuy) {
                minPriceBuy = prices[i];
            }

            int currentProfit = prices[i] - minPriceBuy;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }
}
