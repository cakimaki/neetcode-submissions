class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set;
        set = Arrays.stream(nums).boxed()
            .collect(Collectors.toCollection(HashSet::new));

        int res = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
                int l = 1;
                while(set.contains(n+l)){
                    l++;
                }
                res = Math.max(res, l);
            }
        }

        return res;
    }
}
