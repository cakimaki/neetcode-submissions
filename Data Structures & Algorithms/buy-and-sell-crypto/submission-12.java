class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int p : prices){
            min = Math.min(p,min);
            int currProfit = p - min;
            profit = Math.max(currProfit,profit);
        }
        return profit;
    }
}
