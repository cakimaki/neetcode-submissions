class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int res = 0;
        while(l<r){
            int area=0;
            if(heights[l]<heights[r]){
                area = (r-l)*heights[l];
                res = Math.max(area,res);
                l++;
            }else{
                area = (r-l)*heights[r];
                res = Math.max(area,res);
                r--;
            }
        }
        return res;
    }
}
