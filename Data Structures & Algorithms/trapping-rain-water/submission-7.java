class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1;
        int leftMax=height[l], rightMax=height[r];
        int res = 0;
        while(l<r){
            if(leftMax<rightMax){
                res += leftMax - height[l];
                l++;
                leftMax=Math.max(height[l],leftMax);
            }else{
                res += rightMax - height[r];
                r--;  
                rightMax = Math.max(rightMax, height[r]);
            }
        }
        return res;
    }
}
