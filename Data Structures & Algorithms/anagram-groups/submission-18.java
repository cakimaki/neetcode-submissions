class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>(); 
        
        for(String s : strs){
            int[] count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }
            String keyOfWord = Arrays.toString(count);
            map.computeIfAbsent(keyOfWord, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
