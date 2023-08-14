// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }

        int min_price = prices[0];
        int max_profit = 0;

        for (int price : prices){
            min_price = Math.min(min_price , price);

            int potential_price = price - min_price;

            max_profit = Math.max(max_profit, potential_price);
        }

        return max_profit;
    }
}
