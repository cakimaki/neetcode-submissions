class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int bestProfit = 0;

        for(int p : prices){
            min = Math.min(min,p);
            bestProfit = Math.max(bestProfit, p - min);
        }
        return bestProfit;
    }
}
