class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for(int p : prices){
            min = Math.min(min,p);
            profit = Math.max(p-min,profit);
        }
        return profit;
    }
}
