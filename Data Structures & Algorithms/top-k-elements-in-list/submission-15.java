class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numToCount = new HashMap<>();

        for(int n : nums){
            numToCount.put(n, numToCount.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        Arrays.setAll(buckets, i -> new ArrayList<>());

        for(Map.Entry<Integer,Integer> entry : numToCount.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] res = new int[k];

        for(int i = buckets.length - 1; i > 0 && index < k; i--){
            for(int n : buckets[i]){
                if(index < k){
                    res[index++] = n;
                }
            }
        }

        return res;


    }
}
