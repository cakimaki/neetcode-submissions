class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;

        while(l<r){
            while(l<r && !isLegit(s.charAt(l))){
                l++;
            }       
            while(l<r && !isLegit(s.charAt(r))){
                r--;
            }    

            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private static boolean isLegit(char c){
        return ( c >= 'a' && c<='z' ||
                c>= 'A' && c<='Z'||
                c>='0' && c<='9');
    }
}
