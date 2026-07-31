class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2!=0){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<n;i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != map.get(s.charAt(i))){
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }




        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        } 
    }
}
