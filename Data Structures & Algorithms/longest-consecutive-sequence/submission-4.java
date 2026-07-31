class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int length = 1;                
                while(set.contains(nums[i]+length)){
                    length++;
                }
                res = Math.max(res,length);
            }
        }
        return res;
    }
}
