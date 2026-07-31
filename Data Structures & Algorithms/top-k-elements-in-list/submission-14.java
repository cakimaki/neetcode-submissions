class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> numToFreq = new HashMap<>();

        for(int n : nums){
            numToFreq.put(n, numToFreq.getOrDefault(n,0)+1);
        }

        List<Integer>[] cnt = new List[nums.length+1];
        for(int i = 0; i < cnt.length; i++){
            cnt[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : numToFreq.entrySet()){
            cnt[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int length = 0;

        for(int i = cnt.length - 1; i > 0 && k > length; i--){
            for(int num : cnt[i]){
                if(k == length){
                    break;
                }
                res[length++] = num;
            }
        }

        return res;
    }
}
