class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] cnt = new List[nums.length+1];

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i = 0; i<cnt.length;i++){
            cnt[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            cnt[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] res = new int[k];
        for(int i = cnt.length - 1; i > 0 && index<k; i--){
            for(int n : cnt[i]){
                if(index<k){
                    res[index++] = n;
                }
            }
        }
        return res;
    }
}
