class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];

        for(int i =0; i<=nums.length;i++){
            freq[i] = new ArrayList<>();
        }

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] res = new int[k];
        for(int i = freq.length-1;i>0 && k>index;i--){
            for(int n : freq[i]){
                res[index++] = n;
                if(index==k)return res;
            }
        }
        return res;
    }
}
