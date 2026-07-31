class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(int i = 0; i<s.length();i++){
                count[s.charAt(i)-'a']++;
            }
            String countStr = Arrays.toString(count);
            map.putIfAbsent(countStr, new ArrayList<>());
            map.get(countStr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
