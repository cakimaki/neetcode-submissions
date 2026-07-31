class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        int res = 0;

        for(int n : nums){
            set.add(n);
        }

        for(int n : nums){

            if(set.contains(n-1)){
                continue;
            }
            int length = 0;
            while(set.contains(n + length)){
                length++;
                res = Math.max(res,length);
            }
        }

        return res;
    }
}
