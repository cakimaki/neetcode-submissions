class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int res = 0;
        while(l<=r){
            int k = l + (r-l)/2;
            int sumHours = 0;
            for(int i = 0; i < piles.length;i++){
                sumHours += Math.ceil((double) piles[i] / k);
            }

            if(sumHours <= h){
                r = k - 1;
                res = k;
            }else{
                l = k + 1;
            }
        }
        return res;
    }
}
