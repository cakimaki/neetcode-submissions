class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = 0;
        while(l<=r){
            int k = l + (r-l)/2;

            int sumHours = 0;
            for(int b : piles){
                sumHours += Math.ceil((double) b / k);
            }

            if(sumHours<=h){
                res = k;
                r = k - 1;
            }else{
                l = k + 1;
            }
        }
        return res;
    }
}
