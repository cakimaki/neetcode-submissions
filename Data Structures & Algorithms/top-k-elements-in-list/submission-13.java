class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numToOccur = new HashMap<>();
        List<Integer>[] cnt = new List[nums.length+1];

        for(int i = 0; i < cnt.length; i++){
            cnt[i] = new ArrayList<>();
        }

        for(int i = 0; i < nums.length; i++){
            numToOccur.put(nums[i],numToOccur.getOrDefault(nums[i],0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : numToOccur.entrySet()){
            cnt[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for(int i = cnt.length-1; i > 0 && index < k; i--){
            for(int n : cnt[i]){
                if(index == k){
                    return res;
                }
                res[index++] = n;
            }
        }

        return res;
    }
}
