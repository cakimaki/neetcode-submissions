class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();// key:num val:occurencies
        
        //put in the map and add +1 if...
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] res = new int[k];
        for(int i = buckets.length-1; i >= 0 && index < k; i--){
            for(int n : buckets[i]){
                if(k==index){
                    break;
                }
                res[index++]=n;
            }
        }
        return res;
    }
}
