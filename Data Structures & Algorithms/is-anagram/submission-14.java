class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr  = new int[26];

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            int temp = s.charAt(i) - 'a';
            int temp1 = t.charAt(i) - 'a';

            arr[temp]++;
            arr[temp1]--;
        }

        
        for(int i = 0; i < 26; i++){
            if(arr[i] != 0){
                return false;
            }
        }

        return true;
    }
}
