public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int maxProfit = 0;
        int currentProfit = 0;
        int j = 0;
        for(int i = 1; i < prices.length;i++) {
            currentProfit = prices[i] - prices[j];
            if (currentProfit > maxProfit) maxProfit = currentProfit;
            else if (currentProfit < 1) {
                j = i;
            }
        }
        return maxProfit;
    }

}
