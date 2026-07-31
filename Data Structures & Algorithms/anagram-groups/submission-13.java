class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            int[] cnt = new int[26];

            for(int i = 0; i<s.length();i++){
                cnt[s.charAt(i)-'a']++;
            }
            map.computeIfAbsent(Arrays.toString(cnt), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
