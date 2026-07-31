class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        int res = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r) / 2;
            res = Math.min(res,nums[mid]);
            if(nums[l]<nums[r]){
            res = Math.min(res,nums[l]);
                
                return res;
            }
            if(nums[r]< nums[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return res;
    }
}
