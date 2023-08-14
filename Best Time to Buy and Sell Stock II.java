// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int stackOnHold = prices[0];

        for (int price : prices){
            if(price > stackOnHold){
                profit += (price - stackOnHold);
            }

            stackOnHold = price;
        }

        return profit;
        
    }
}
