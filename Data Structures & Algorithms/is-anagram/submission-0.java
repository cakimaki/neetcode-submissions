class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        int n = s.length();
        if(n != t.length()){
            return false;
        }

        for(int i=0; i<arr.length; i++){
            arr[i]=0;
        }

        for(int i=0; i<n;i++){
            arr[s.charAt(i) - 'a'] +=1;
            arr[t.charAt(i) - 'a'] -=1;
        }

        for(int i =0; i<arr.length;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
