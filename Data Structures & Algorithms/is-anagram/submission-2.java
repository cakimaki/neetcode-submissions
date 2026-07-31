class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];
        int n = s.length();
        if(n!=t.length()){
            return false;
        }

        for(int i = 0; i<n;i++){
            cnt[s.charAt(i)-'a']++;
            cnt[t.charAt(i)-'a']--;     
        }
        
        for(int i =0;i<26;i++){
            if(cnt[i]!=0){
                return false;
            }
        }
        return true;
    }
}
