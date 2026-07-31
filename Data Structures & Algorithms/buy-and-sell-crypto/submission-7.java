class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int res=0;

        for(int price : prices){
            min = Math.min(price,min);
            res = Math.max(price-min,res);
        }
        return res;
    }
}
