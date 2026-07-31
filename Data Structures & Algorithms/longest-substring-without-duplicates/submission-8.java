class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> uniq = new HashSet<>();

        int l = 0;
        int res = 0;
        for(int r = 0; r < s.length(); r++){
            while(uniq.contains(s.charAt(r))){
                uniq.remove(s.charAt(l));
                l++;
            }
            res = Math.max(res, r - l + 1);

            uniq.add(s.charAt(r));
        }
        return res;
    }
}
