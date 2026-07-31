class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> lettersToWords = new HashMap<>();
        
        for(String s : strs){
            int[] cnt = new int[26];

            for(char ch : s.toCharArray()){
                cnt[ch - 'a']++;
            }

            String key = Arrays.toString(cnt);
            lettersToWords.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(lettersToWords.values());

    }
}
