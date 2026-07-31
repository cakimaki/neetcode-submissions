class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1;
        int maxL = height[l], maxR = height[r];
        int area=0;
        while(l<r){
            if(maxL<maxR){
                l++;
                maxL = Math.max(maxL,height[l]);
                area += maxL - height[l];
                System.out.println("maxLeft"+maxL);
            }else{
                r--;
                maxR = Math.max(maxR,height[r]);
                area += maxR - height[r];
                System.out.println("maxRihgt"+maxR);
            }
            System.out.println(area);
        }
        return area;
    }
}
