class Solution {

    public String encode(List<String> strs) {
        StringBuilder coded = new StringBuilder();
        for(String s : strs){
            coded.append(s.length()+"#"+s);
        }
        return coded.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i + 1;
            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            res.add(str.substring(i, i + length));
            i = i + length;
        }
        return res;
    }
}
