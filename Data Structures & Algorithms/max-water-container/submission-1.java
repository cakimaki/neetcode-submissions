class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;

        int biggestArea = 0;
        while(l<r){
            int smallerHeight = Math.min(heights[l],heights[r]);
            
            biggestArea = Math.max(biggestArea, (r-l)*smallerHeight);

            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return biggestArea;
    }
}
