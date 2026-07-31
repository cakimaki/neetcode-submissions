class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1;
        int maxL = height[l], maxR = height[r];
        int res=0;
        while(l<r){
            if(maxL < maxR){
                l++;
                maxL = Math.max(height[l], maxL);
                res += maxL-height[l];
            }else{
                r--;
                maxR = Math.max(height[r],maxR);
                res += maxR-height[r];
            }
        }
        return res;
    }
}
