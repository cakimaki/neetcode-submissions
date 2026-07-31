class Solution {

    public String encode(List<String> strs) {
        StringBuilder customString = new StringBuilder();
        for(String s : strs){
            customString.append(s.length()+"#"+s);
        }
        return customString.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i + 1;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + length;
            String word = str.substring(i,j);
            res.add(word);
            i = j;
        }
        return res;
    }
}
